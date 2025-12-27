package com.example.locationenabler;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.*;
import com.google.android.gms.tasks.Task;

import org.apache.cordova.*;

public class LocationEnabler extends CordovaPlugin {

    private static final int REQUEST_CHECK_SETTINGS = 1001;
    private CallbackContext callbackContext;

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) {
        if ("enableLocation".equals(action)) {
            this.callbackContext = callbackContext;
            cordova.setActivityResultCallback(this);
            cordova.getActivity().runOnUiThread(this::checkLocationSettings);
            return true;
        }
        return false;
    }

    private void checkLocationSettings() {
        Activity activity = cordova.getActivity();

        LocationRequest locationRequest = LocationRequest.create()
                .setPriority(Priority.PRIORITY_HIGH_ACCURACY);

        LocationSettingsRequest request =
                new LocationSettingsRequest.Builder()
                        .addLocationRequest(locationRequest)
                        .setAlwaysShow(true)
                        .build();

        SettingsClient client = LocationServices.getSettingsClient(activity);
        Task<LocationSettingsResponse> task = client.checkLocationSettings(request);

        task.addOnSuccessListener(response -> {
            callbackContext.success("Location already enabled");
        });

        task.addOnFailureListener(exception -> {
            if (exception instanceof ResolvableApiException) {
                try {
                    ResolvableApiException resolvable =
                            (ResolvableApiException) exception;

                    resolvable.startResolutionForResult(
                            activity,
                            REQUEST_CHECK_SETTINGS
                    );
                } catch (IntentSender.SendIntentException e) {
                    callbackContext.error("Unable to open location dialog");
                }
            } else {
                callbackContext.error("Location settings unavailable");
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_CHECK_SETTINGS) {
            if (resultCode == Activity.RESULT_OK) {
                callbackContext.success("Location enabled by user");
            } else {
                callbackContext.error("User cancelled location enable");
            }
        }
    }
}

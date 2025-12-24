package com.example.locationenabler;

import android.content.Intent;
import android.provider.Settings;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class LocationEnabler extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
            throws JSONException {

        if ("enableLocation".equals(action)) {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            cordova.getActivity().startActivity(intent);
            callbackContext.success("Location settings opened");
            return true;
        }

        callbackContext.error("Invalid action");
        return false;
    }
}

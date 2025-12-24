function enableLocation() {
    if (!window.LocationEnabler) {
        alert("Plugin not available");
        return;
    }

    LocationEnabler.enableLocation(
        function () {
            alert("Location enabled / settings opened");
        },
        function (err) {
            alert("Error: " + err);
        }
    );
}

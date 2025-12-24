var exec = require('cordova/exec');

exports.enableLocation = function (success, error) {
    exec(success, error, 'LocationEnabler', 'enableLocation', []);
};

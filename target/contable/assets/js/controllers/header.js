/* global app */

app.controller('ctrlHeader', function ($scope, $http, $location) {

    var actionUrl = '/contable';
    $scope.goToLogin = function () {
        location.href = actionUrl + '/login';
    };
    $scope.goToUsuarios = function () {
        location.href = actionUrl + '/usuarios';
    };
});

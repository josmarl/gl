/* global app */

app.controller('ctrlHeader', function ($scope, $http, $location) {

    var actionUrl = '/grupoLinaresSoftware';
    $scope.goToUsuarios = function () {
        location.href = actionUrl + '/usuarios';
    };
    $scope.goToClientes = function () {
        location.href = actionUrl + '/clientes';
    };
});

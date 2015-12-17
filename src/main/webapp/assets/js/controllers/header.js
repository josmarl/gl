/* global app */

app.controller('ctrlHeader', function ($scope, $http, $location) {

    var actionUrl = '/grupoLinaresSoftware';
    $scope.goToLogin = function () {
        location.href = actionUrl + '/login';
    };
    $scope.goToUsuarios = function () {
        location.href = actionUrl + '/usuarios';
    };
    $scope.goToClientes = function () {
        location.href = actionUrl + '/clientes';
    };
    $scope.goToFactura = function (){
        location.href = actionUrl + '/factura';
    };
});

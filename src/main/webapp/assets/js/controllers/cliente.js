/* global app */

app.controller('ctrlCliente', function ($scope, $http, $location) {

    var actionUrl = '/grupoLinaresSoftware/getClientes',
            listClientes = function () {
                $http.get(actionUrl).success(function (data) {
                    $scope.listaClientes = data;
                });
            };
    listClientes();
});

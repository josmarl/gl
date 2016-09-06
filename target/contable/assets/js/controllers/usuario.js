/* global app */

app.controller('ctrlUsuario', function ($scope, $http, $location) {

    $scope.usuario = '';
    $scope.dni = '';
    $scope.nombres = '';
    $scope.direccion = '';
    $scope.login = '';
    $scope.password = '';

    var actionUrl = '/contable/getUsuarios',
            listUsuarios = function () {
                $http.get(actionUrl).then(function (response) {
                    $scope.listaUsuarios = response.data;
                }, function (response) {
                    console.log("Err" + response);
                });
            };
    listUsuarios();


    $scope.addUsuario = function () {
        var data = {};
        data.login = $scope.login;
        data.password = $scope.password;
        data.estado = 1;
        $http.post("/contable/usuario/add", data).then(function (response) {
            clearData();
            listUsuarios();
            $('#newUsuario').modal('toggle');
        }, function (response) {
            console.log("Err:" + response);
        });
    };

    clearData = function () {
        $scope.usuario = '';
        $scope.dni = '';
        $scope.nombres = '';
        $scope.direccion = '';
        $scope.login = '';
        $scope.password = '';
    };
});

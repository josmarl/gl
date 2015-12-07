/* global app */

app.controller('ctrlUsuario', function ($scope, $http, $location) {

    $scope.usuario = '';
    $scope.dni = '';
    $scope.nombres = '';
    $scope.direccion = '';

    var actionUrl = '/grupoLinaresSoftware/getAll',
            listUsuarios = function () {
                $http.get(actionUrl).success(function (data) {
                    $scope.listaUsuarios = data;
                });
            };
    listUsuarios();


    $scope.addUsuario = function () {
        var data = {};
        data.dni = $scope.dni;
        data.nombres = $scope.nombres;
        data.direccion = $scope.direccion;
        $http.post("/grupoLinaresSoftware/usuario/add", data)
                .then(function () {
                    listUsuarios();
                    $('#newUsuario').modal('toggle');
                });

    };
});

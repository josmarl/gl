<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-static-top" ng-controller="ctrlHeader">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Grupo Linares</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a href="#" ng-click="goToLogin()">Home</a></li>
                <li><a href="#" ng-click="goToUsuarios()">Adm. Usuarios</a></li>
                <li><a href="#" ng-click="goToClientes()">Adm. Clientes</a></li>
                <li><a href="#">Page 3</a></li>
            </ul>
        </div>
    </div>
</nav>


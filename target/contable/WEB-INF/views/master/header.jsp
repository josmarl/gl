<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-static-top" ng-controller="ctrlHeader">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SCV</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        Administracion<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#" ng-click="goToUsuarios()">Adm. Usuarios</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#" ng-click="goToClientes()">Adm. Clientes</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        Comprobante<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#" ng-click="goToFactura()">Crear Factura</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Crear Boleta</a></li>
                    </ul>
                </li>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Buscar Modulo">
                    </div>
                </form>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        Perfil<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Edit Perfil</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#" ng-click="goToLogin()">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>


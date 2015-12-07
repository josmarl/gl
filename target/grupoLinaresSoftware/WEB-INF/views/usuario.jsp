<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" ng-controller="ctrlUsuario">
    <button type="button" class="btn btn-primary btn-primary" data-toggle="modal" data-target="#newUsuario">
        New
    </button>

    <div class="modal fade" id="newUsuario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <form ng-submit="addUsuario()">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Registro</h4>
                    </div>
                    <div class="modal-body">

                        <label>Nombres</label>
                        <input class="form-control" type="text" name="nombres" ng-model="nombres"/>
                        <label>DNI</label>
                        <input class="form-control" type="text" name="dni" ng-model="dni"/>
                        <label>Direccion</label>
                        <input class="form-control" type="text" name="direccion" ng-model="direccion"/>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <input type="submit" class="btn btn-success" value="Save"/>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Id</th>
                <th>DNI</th>
                <th>Nombres</th>
            </tr>
        </thead>
        <tbody>
            <tr ng-repeat="usuario in listaUsuarios">
                <td>{{usuario.idUsuario}}</td>
                <td>{{usuario.dni}}</td>
                <td>{{usuario.nombres}}</td>
            </tr>
        </tbody>
    </table>



</div>    
<script type="text/javascript" src="<c:url value='/assets/js/controllers/usuario.js'/>"></script>      



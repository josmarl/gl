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
                        <div class="form-group">
                            <label for="login">Usuario</label>
                            <input class="form-control" type="text" name="login" ng-model="login" required="true"/>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input class="form-control" type="password" name="password" ng-model="password" required="true"/>
                        </div>
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
                <th>Login</th>
            </tr>
        </thead>
        <tbody>
            <tr ng-repeat="usuario in listaUsuarios">
                <td>{{usuario.id}}</td>
                <td>{{usuario.login}}</td>
            </tr>
        </tbody>
    </table>
</div>    
<script type="text/javascript" src="<c:url value='/assets/js/controllers/usuario.js'/>"></script>      



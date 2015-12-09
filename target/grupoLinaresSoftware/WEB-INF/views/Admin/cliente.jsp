<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" ng-controller="ctrlCliente">
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Razón Social</th>
                <th>RUC</th>
                <th>Codigo</th>
            </tr>
        </thead>
        <tbody>
            <tr ng-repeat="cliente in listaClientes">
                <td>{{cliente.razonSocial}}</td>
                <td>{{cliente.ruc}}</td>
                <td>{{cliente.codigoCli}}</td>
            </tr>
        </tbody>
    </table>
</div>
<script type="text/javascript" src="<c:url value='/assets/js/controllers/cliente.js'/>"></script>      

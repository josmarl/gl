<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bienvenidos</title>
        <link href="assets/libs/bootstrap/css/bootstrap.min.css"
              rel="stylesheet">
        <link href="assets/libs/bootstrap/css/bootstrap-theme.min.css"
              rel="stylesheet">
        <script type="text/javascript"
        src="assets/libs/jquery/jquery-2.1.4.min.js"></script>
        <script type="text/javascript"
        src="assets/libs/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                Add
            </button>

            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <form action="${pageContext.request.contextPath}/usuario/add" method="post">
                            <input type="hidden" name="idUsuario" value="${usuario.idUsuario}" />
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">Registro</h4>
                            </div>
                            <div class="modal-body">

                                <input class="form-control" type="text" name="nombres" />
                                <input class="form-control" type="text" name="dni" />
                                <input class="form-control" type="text" name="direccion" />

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                <input type="submit" class="btn btn-success" value="Add" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <c:if test="${!empty listaUsuarios}">
                <table class="table table-striped">
                    <tr>
                        <th width="80">Person ID</th>
                        <th width="120">Person Name</th>
                        <th width="120">Person Country</th>
                    </tr>
                    <c:forEach items="${listaUsuarios}" var="usuario">
                        <tr>
                            <td>${usuario.idUsuario}</td>
                            <td>${usuario.nombres}</td>
                            <td>${usuario.direccion}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </body>
</html>
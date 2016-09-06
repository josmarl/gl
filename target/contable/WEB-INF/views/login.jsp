<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row main">
        <div class="panel-heading">
            <div class="panel-title text-center">
                <h1 class="title">Sistema de Compras y Ventas</h1>
                <hr />
            </div>
        </div> 
        <div class="main-login main-center">
            <form:form cssClass="form-horizontal" method="post" action="${pageContext.request.contextPath}/loginAcceso">
                <div class="form-group">
                    <label for="login" class="cols-sm-2 control-label">Ingrese Usuario:</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span> 
                            <input type="text" name="login" class="form-control" placeholder="Ingrese usuario"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Ingrese Password:</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock" aria-hidden="true"></i></span>
                            <input type="password" name="password" class="form-control" placeholder="Ingrese password"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success btn-lg btn-block login-button">Ingresar</button>
                </div>
            </form:form>
        </div>
    </div>
</div>

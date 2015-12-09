<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="jumbotron">
    <div class="container-fluid">
        <form:form method="post" action="${pageContext.request.contextPath}/usuarios">
            <label>Ingrese Usuario:</label>
            <input type="text" name="username" class="form-control"/>
            <label>Ingrese Password:</label>
            <input type="password" name="password" class="form-control"/>
            <button type="submit" class="btn btn-success">Ingresar</button>
            <button class="btn btn-danger">Cancelar</button>
        </form:form>
    </div>
</div>

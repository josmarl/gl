<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${!empty listaUsuarios}">
    <table class="tg">
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
</body>
</html>
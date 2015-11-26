<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="usuario" items="${usuarios}" varStatus="id">
		<tr>
			<td><c:out value="${usuario.nombres}"></c:out></td>
			<td><c:out value="${usuario.dni}"></c:out></td>
			<td><c:out value="${usuario.direccion}"></c:out></td>
		</tr>
	</c:forEach>
</body>
</html>
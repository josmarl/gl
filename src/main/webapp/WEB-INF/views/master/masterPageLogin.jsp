<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <link href="<c:url value='/assets/libs/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
        <link href="<c:url value='/assets/libs/bootstrap/css/bootstrap-theme.min.css'/>" rel="stylesheet">
        <link href="<c:url value='/assets/css/login.css'/>" rel="stylesheet">
        <script type="text/javascript" src="<c:url value='/assets/libs/jquery/jquery-2.1.4.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/assets/libs/bootstrap/js/bootstrap.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/assets/libs/angular/angular-1.3.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/assets/libs/angular/angular-resource.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/assets/libs/angular/app.js'/>"></script>



    </head>
    <body ng-app="app">
        <div class="container-fluid">
            <tiles:insertAttribute name="body" />
        </div>
    </body>
</html>


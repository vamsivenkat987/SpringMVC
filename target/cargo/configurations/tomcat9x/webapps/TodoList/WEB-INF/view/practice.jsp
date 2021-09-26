<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <c:import var="data" url="http://www.javatpoint.com" />
    <c:out value="${data}" />
    <c:out value="${Welcome to this page }" />
</body>
</html>
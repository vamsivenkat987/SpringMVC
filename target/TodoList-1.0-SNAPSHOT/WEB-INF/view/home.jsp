<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="org.example.utils.Mappings"%>

<html>
<head>
    <title>Welcome to home Page</title>
</head>
<body background= "https://png.pngtree.com/thumb_back/fh260/back_pic/04/48/50/00585a3568a0a7d.jpg">
    <div align="center" >
        <c:url var="itemsLink" value="${Mappings.ITEMS}" />
        <h2><a href="${itemsLink}">Show to do Items</a></h2>
    </div>
</body>
</html>
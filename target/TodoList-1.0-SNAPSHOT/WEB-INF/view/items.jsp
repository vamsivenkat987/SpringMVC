<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.utils.Mappings"%>
<html>
<head>
    <title>Todo Items</title>
</head>
<body background = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSyDL1IUH_ZkF1NhtlWWOTmBIH8NMHkj3YOA&usqp=CAU">
    <!-- <h1>Welcome to this page ${user}</h1>
    <h2> Age parameter is ${age}</h2>
    <h2>${welcomeMessage}</h2> -->

    <div align="center">
    <c:url var="AddUser" value="${Mappings.ADDITEM}" />
    <h2><a href="${AddUser}">Add User</a></h2>
        <table border="1" cellpadding="5">
            <caption><h2>ToDo Items</h2></caption>

            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>DeadLine</th>
                <th>Date</th>
                <th>View</th>
                <th>Edit</th>
                <th>Delete</th>

            </tr>

            <c:forEach var="item" items="${todoData.items}" >
                    <c:url var="viewUrl" value="${Mappings.VIEWITEM}" >
                        <c:param name="id" value="${item.id}"/>
                    </c:url>
                    <c:url var="editUrl" value="${Mappings.ADDITEM}" >
                        <c:param name="id" value="${item.id}"/>
                    </c:url>
                    <c:url var="DeleteUrl" value="${Mappings.DELETEITEM}" >
                        <c:param name="id" value="${item.id}"/>
                    </c:url>
                <tr>
                    <td><c:out value="${item.id}"/></td>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.details}"/></td>
                    <td><c:out value="${item.date}"/></td>
                    <td><a href="${viewUrl}">View User</a></td>
                    <td><a href="${editUrl}">Edit User</a></td>
                    <td><a href="${DeleteUrl}">Delete User</a></td>

                </tr>
            </c:forEach>
        </table>
    </div>
    <div>

    </div>
</body>
</html>
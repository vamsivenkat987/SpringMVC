<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.utils.Mappings"%>
<html>
<head>
    <title>View Item</title>
</head>
<body background = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSyDL1IUH_ZkF1NhtlWWOTmBIH8NMHkj3YOA&usqp=CAU">
    <div align="center">

        <table border="1" cellpadding="5">
            <tr>
                <td><label>ID</label></td>
                <td>
                  <c:out value="${todoItem.id}"/>
                </td>
              </tr>
              <tr>
                <td><label>Title</label></td>
                <td>
                    <c:out value="${todoItem.title}"/>

                </td>
              </tr>
              <tr>
                <td><label>Details</label></td>
                <td>
                    <c:out value="${todoItem.details}"/>

                </td>
              </tr>
              <tr>
                <td><label>Date</label></td>
                <td>
                  <c:out value="${todoItem.date}"/>
                </td>
             </tr>
        </table>
    </div>
    <c:url var="AddUser" value="${Mappings.ITEMS}" />
    <h2><a href="${AddUser}">Show Table</a></h2>
</body>
</html>
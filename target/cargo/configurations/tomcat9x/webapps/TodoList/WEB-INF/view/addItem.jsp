<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="org.example.utils.AttributeNames" %>
<html>
<head>
    <title>Add Items</title>
</head>
<body background = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSyDL1IUH_ZkF1NhtlWWOTmBIH8NMHkj3YOA&usqp=CAU">

    <div align="center">
        <form:form method="POST" modelAttribute="${AttributeNames.TODOITEM}">
            <table>
                  <tr>
                    <td><label>ID</label></td>
                    <td>
                      <form:input path="id" disabled="true"/>
                    </td>
                  </tr>
                  <tr>
                    <td><label>Title</label></td>
                    <td>
                      <form:input path="title" disabled="false"/>
                    </td>
                  </tr>
                  <tr>
                    <td><label>DeadLine</label></td>
                    <td>
                      <form:input path="date"/>
                    </td>
                  </tr>
                  <tr>
                    <td><label>Details</label></td>
                    <td>
                      <form:textarea path="details" disabled="false"/>
                    </td>
                  </tr>
                  <tr>
                    <td><input type="submit" value="submit"/></td>
                  </tr>
            </table>

        </form:form>
    </div>
</body>
</html>
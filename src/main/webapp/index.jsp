<!DOCTYPE html>
<html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<p>
    <head>
        <title>My ToDo List</title>
    </head>
<body>

<h1 aling="center">ToDoList</h1>

<table style="width:100%">
    <tr>
        <th>TaskName</th>
        <th>Description</th>
        <th>TaskId</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${myList}" var="task">
        <tr>
            <td><c:out value="${task.getName()}"/></td>
            <td><c:out value="${task.getDescription()}"/></td>
            <td><c:out value="${task.getId()}"/></td>
            <td><c:out value="${task.getStatus()}"/></td>
        </tr>
    </c:forEach>
</table>

<form action="addTask" method="post">
    <textarea name="taskName"></textarea>
    <textarea name="taskDescription"></textarea>
    <input type="submit" name="AddTask" value="addTask">
</form>

<form action="deleteTask" method="post">
    <input type="submit" name="DeleteTask" value="deleteTask">
</form>


<form action="changeStatus" method="post">
    <textarea name="taskId"></textarea>
    <input type="submit" name="ChangeStatus" value="changeStatus">
</form>

</body>

</html>

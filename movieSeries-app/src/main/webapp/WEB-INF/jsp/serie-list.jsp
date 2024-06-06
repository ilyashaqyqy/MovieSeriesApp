<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Series List</title>
</head>
<body>
    <h1>Series List</h1>
    <a href="series/new">Add New Serie</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="serie" items="${seriesList}">
            <tr>
                <td>${serie.id_serie}</td>
                <td>${serie.titre}</td>
                <td>${serie.description}</td>
                <td>
                    <a href="series/edit/${serie.id_serie}">Edit</a>
                    <a href="series/delete/${serie.id_serie}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

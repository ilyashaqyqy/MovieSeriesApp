<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Serie Form</title>
</head>
<body>
    <h1>${serie.id_serie == null ? 'New Serie' : 'Edit Serie'}</h1>
    <form action="series" method="post">
        <input type="hidden" name="id_serie" value="${serie.id_serie}" />
        Title: <input type="text" name="titre" value="${serie.titre}" /><br/>
        Description: <input type="text" name="description" value="${serie.description}" /><br/>
        Date Start: <input type="date" name="date_debut" value="${serie.date_debut}" /><br/>
        Date End: <input type="date" name="datefin" value="${serie.datefin}" /><br/>
        Season: <input type="text" name="saison" value="${serie.saison}" /><br/>
        Genre: <input type="text" name="genre" value="${serie.genre}" /><br/>
        Creator: <input type="text" name="createur" value="${serie.createur}" /><br/>
        Actor: <input type="text" name="acteur" value="${serie.acteur}" /><br/>
        Rating: <input type="text" name="not" value="${serie.not}" /><br/>
        Image: <input type="text" name="image" value="${serie.image}" /><br/>
        <input type="submit" value="Save" />
    </form>
</body>
</html>

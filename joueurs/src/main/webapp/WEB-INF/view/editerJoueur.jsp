<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Joueur</title>
</head>
<body>
<form action="updateJoueur" method="post">
<pre>
id : <input type="text" name="idJoueur" value="${joueur.idJoueur}">
nom :<input type="text" name="nomJoueur" value="${joueur.nomJoueur}">
Prenom :<input type="text" name="prenomJoueur" value="${Joueur.prenomJoueur}">
jourdesignature
 <fmt:formatDate pattern="yyyy-MM-dd" value="${Joueur.jourdesignature}"
var="formatDate" />
Poste :<input type="text" name="posteJoueur" value="${Joueur.posteJoueur}">
Age :<input type="number" name="Age" value="${Joueur.Age}">

 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="editer">
</pre>
</form>
<br/>
<br/>
<a href="ListeJoueur">Liste Joueur</a>
</body>
</html>

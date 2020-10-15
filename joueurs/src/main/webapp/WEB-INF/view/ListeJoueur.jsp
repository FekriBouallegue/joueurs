<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Joueur</title>
</head>
<body>
 <h1 >
 Liste des Joueurs
 </h1>
 <table >
 <tr>
 <th>ID</th><th>Nom Joueur</th><th>Prenom Joueur</th><th>jourdesignature</th><th>Poste Joueur</th><th>Age</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${joueurs}" var="p">
 <tr>
 <td>${p.idJoueur}</td>
 <td>${p.nomJoueur }</td>
 <td>${p.prenomJoueur }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.jourdesignature}" /></td>
 <td>${p.PosteJoueur }</td>
  <td>${p.Age }</td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerJoueur?id=${p.idJoueur }">Supprimer</a></td>
 <td><a href="modifierJoueur?id=${p.idJoueur }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>

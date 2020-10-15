<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Save Joueur</title>
</head>
<body>
<form action="saveJoueur" method="post">
<pre>
Nom : <input type="text" name="nomJoueur">
Prenom : <input type="text" name="prenomJoueur">
jour de signature : <input type="date" name="jourdesignature">
Poste de Joueur : <input type="text" name="posteJoueur">
Age : <input type="number" name="age">
<input type="submit" value="Enregistrer">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeJoueur">Liste de Jouers</a>
</body>
</html>
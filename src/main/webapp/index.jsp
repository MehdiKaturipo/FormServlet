<html>
<head>
    <meta charset="UTF-8">
    <title>FORM CLOUD</title>
    <link rel="stylesheet" href="">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="css/Style.css">
</head>
<body style="font-family: Optima" class="mg20"><br>
<p class="h4 bold gray">Formulaire </p><br>
<form action="form" method="get" name="form1">
    <p class="bold">
               Nom : <input type="text" name="nom" placeholder="Nom" required>
               Prenom : <input type="text" name="prenom" placeholder="Prenom" required>
    </p>
    <p><span class="bold"> Sexe : </span>
        <input type="radio" name="sexe" value="Homme" checked> Homme
        <input type="radio" name="sexe" value="Femme"> Femme
    </p>
    <p class="bold"> Commentaire : <br>
        <textarea name="commentaire" cols="60" rows="10" placeholder="Commentaire" class="gray"></textarea>
        <br><br>
        <input class="btn btn-success bold" type="submit" name="submit" value="soumettre">
    </p>
</form>
</body>
</html>

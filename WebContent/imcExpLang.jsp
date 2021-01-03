<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Calculo IMC</title>
    <link rel="stylesheet" type="text/css" href="styles/estilo.css" media="screen" />
    <link href="https://fonts.googleapis.com/css2?family=Archivo:wght@400;700&family=Poppins&display=swap"rel="stylesheet">
</head>
<body>
    <div id="container">
        <header>Calcule seu IMC aqui !</header>
        <footer>
            <p id="result"><b>Resultado: O seu indice é ${param.peso/(param.altura*param.altura)}</b></p>
        </footer>
    </div>
</body>
</html>
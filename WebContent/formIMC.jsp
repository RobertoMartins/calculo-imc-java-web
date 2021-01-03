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
        <main>
            <form action="imcTagLib.jsp">
                <div class="inputs">
                    <strong>Altura (m): </strong>
                    <input type="text" id="altura" name="altura" placeholder="(ex.: 1.70) ">
                </div>
                <div class="inputs">
                    <strong>Peso (kg): </strong>
                    <input type="text" id="peso" name="peso" placeholder="(ex.: 77.5) ">
                </div>
                <input type="submit"id="calcular" value="Calcular">
               
            </form>
            
        </main>
    </div>
</body>
</html>
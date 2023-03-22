    <%-- 
    Document   : newjsp
    Created on : 22/03/2023, 9:38:25 a. m.
    Author     : Johan Herrera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Star Wars</title>
    <!-- Link para obtener otra fuente de letra -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Edu+NSW+ACT+Foundation:wght@400;600&display=swap" rel="stylesheet">
    <!-- Llamado de los estilos CSS -->
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <%@page import="paquete1.*" %>
    <!-- Encabezado de Pagina -->
    <header>
        <h1>Datos y Combustibe Final</h1>
    </header>
    <!-- Cuerpo de Pgina -->
    <section class="resumen">
        <article class="formulario">
            <h2>Halcon Milenario</h2>          
        </article>
        <article class="formulario">
            <h2>Destructor Estelar</h2>          
        </article>
        <article class="formulario">
            <h2>LanzaderaImperial</h2>          
        </article>
        <article class="formulario">
            <h2>Supremacy</h2>          
        </article>
        <article class="formulario">
            <h2>At-At</h2>          
        </article>
    </section>    
    <div class="resumen">
        <button class="botones">
            <a href="Index.html">Volver</a>
        </button>
    </div>
</body>
</html>

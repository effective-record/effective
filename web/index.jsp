<%-- 
    Document   : index.jsp
    Created on : 29/09/2020, 09:56:56 AM
    Author     : AndresSaenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO LOGIN</title>
    </head>
    <body>
        <h1>DORMULARIO CARGANDO UN SERVLET</h1>
        
        <div class="Formulario">
            <h2>USO DE SERVELET</h2>
            <form action="ServletAndresSaenz" method="post">
                <label>Usuario</label><input id="" type="text" name="usuario">
                <br>
                <br>
                <label>Contraseña</label><input id="" type="text" name="clave">
                <br>
                <br>
                <input type="submit" value="Iniciar sesión">
                <br>
                

            </form>
        </div>
    </body>
</html>

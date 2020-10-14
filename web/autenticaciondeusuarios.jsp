<%-- 
    Document   : autenticaciondeusuarios
    Created on : 17/06/2020, 09:40:18 PM
    Author     : AndresSaenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <script src="javascript/jquery-1.11.0.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>

            <title>Autenticación usuario</title>
        </head>

        <body>
          
            <br>
            <br>
            <br>


            <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="col-12">


                            <center>
                                <h1>Autenticación de usuarios</h1>
                            </center>
                            <br>
                            <center> 
                                <img src="imagenes/iniciar-sesion.png" alt=""/>
                            </center>
                            <br>



                            <form action="IniciarSesion" method="post" class="cold-12">
                                <h5>N°identificación</h5>
                                <input type="text" name="identificacion" class="form-control" placeholder="Ingrese su número de identificación">
                                <br>
                                <h5>Clave</h5>
                                <input type="password" name="clave" class="form-control" placeholder="Ingrese su clave"> 
                                <div class="form-group">
                                    <br>
                                    <center>
                                        <button class="btn btn-success" >Ingresar</button
                                    </center>  
                                </div>
                              
                            </form>
                        </div>
                    </div>
            </div>

          
            
        </body>
    </html>
<%-- 
    Document   : menu
    Created on : 13/10/2020, 09:10:02 PM
    Author     : AndresSaenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/bootstrap.css">
        <link rel="stylesheet" href="./css/estilosInicio.css">
        <title>INICIO</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Menú</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Registros
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="vista/registrarproductos.jsp">Registrar productos</a>
                            <a class="dropdown-item" href="vista/registrarproveedores.jsp">Registrar proveedores</a>
                            <a class="dropdown-item" href="vista/registrardetallemovimiento.jsp">Registrar detalle movimiento</a>
                            <a class="dropdown-item" href="vista/registrarmovimiento.jsp">Registrar movimiento</a>
                            <a class="dropdown-item" href="vista/consultarreportes.jsp">Consultar reportes</a>
                        </div>
                    </li>

                </ul>
                <form class="form-inline my-2 my-lg-0">
                    
                    <button class="btn btn-outline-info my-2 my-sm-0" type="submit"><a href="vista/registrarusuarios.jsp" class="text-decoration-none" style="color: white;">Registrarse</a></button>
                </form>
                
                
                <form class="form-inline my-2 my-lg-0">
                    
                    <button class="btn btn-outline-info my-2 my-sm-0" type="submit"><a href="autenticaciondeusuarios.jsp" class="text-decoration-none" style="color: white;" >Salir</a></button>
                   

                </form>
            </div>
        </nav>


        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" style="height: 900px;">
                <div class="carousel-item active" style="height: 900px;">
                    <img src="./imagenes/notepad-2020.jpg" class="d-block w-100" alt="..." style="height: 900px;">
                </div>
                <div class="carousel-item" style="height: 900px;">
                    <img src="./imagenes/calculator-178127_1280.jpg" class="d-block w-100" alt="..." style="height: 900px;">
                </div>
                <div class="carousel-item" style="height: 900px;">
                    <img src="./imagenes/school-2020.jpg" class="d-block w-100" alt="..." style="height: 900px;">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <!--<center class="formularios">
            <h2>Formularios</h2>
            <h2><a href="">Formulario registro usuario del sistema</a></h2>
        </center>
    
        <center class="formularios">
            <h2><a href="vista/registrarproductos.jsp">Formulario registrar productos</a></h2>
        </center>
    
    
        <center class="formularios">
            <h2><a href="vista/registrarproveedores.jsp">Formulario registrar proveedores</a></h2>
        </center>
    
        <center class="formularios">
            <h2><a href="autenticaciondeusuarios.jsp">Formulario autenticación usuario del sistema</a></h2>
        </center>
    
    
        <center class="formularios">
            <h2><a href="vista/consultarreportes.jsp">Formulario consultar reportes</a></h2>
        </center>
    
        <center class="formularios">
            <h2><a href="vista/registrarmovimiento.jsp">Formulario registrar movimiento</a></h2>
        </center>
    
        <center class="formularios">
            <h2><a href="vista/registrardetallemovimiento.jsp">Formulario registrar detalle movimiento</a></h2>
        </center>-->

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
        <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
        <script src="./js/bootstrap.js"></script>
    </body>
</html>

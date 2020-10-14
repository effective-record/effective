
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../javascript/jquery-1.11.0.min.js" type="text/javascript"></script>
        <script src="../javascript/objecionar_proveedores.js"></script>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>

        <title>Registrar proveedores</title>
    </head>
    
    <body>
       

        <br>
        <br>


        <div class="modal-dialog">
            <div class="col-12">
                <div class="modal-content">



                    <center>
                        <h1>Registro proveedores</h1>
                    </center>
                    <br>
                    <center> 
                        <img src="../imagenes/agregar-usuario.png" alt=""/>
                    </center>
                    <br>



                    <form action="Registrar_proveedores.java" method="post" onsubmit="return objecionar_proveedores" class="col-12">
                        <h5 for="Identificacion" >Identificacion</h5>
                        <input id="txt_identificacion_reg" type="text" class="form-control" placeholder="Ingrese la identificacion del proveedor" name="identificacion">
                        <br>
                        <h5 for="Nombre">Nombre proveedor</h5>
                        <input id="txt_nombre_reg" type="text" class="form-control" placeholder="Ingrese el nombre del proveedor" name="nombre"> 
                        <br>
                        <h5 for="Correo">Correo electronico</h5>
                        <input id="txt_correo_reg" type="email" class="form-control" placeholder="Ingrese el correo del proveedor" name="correo"> 
                        <br>
                        <h5 for="Direccion">Dirección de la empresa</h5>
                        <input id="txt_direccion_reg" type="text" class="form-control" placeholder="Ingrese la direccion del proveedor" name="direccion"> 
                        <br>
                        <h5 for="Telefonouno">Teléfono 1</h5>
                        <input id="txt_telefonouno_Reg" type="tel" class="form-control" placeholder="Ingrese el primer telefono del proveedor" name="telefonouno"> 
                        <br>
                        <h5 for="Telefonodos">Teléfono 2</h5>
                        <input id="txt_telefonodos_Reg" type="tel" class="form-control" placeholder="Si el proveedor tiene un segundo número de telefono ingreselo" name="telefonodos" > 
                        <br>
                        <div id=ControlRegistro" class="bd-example">
                            <input id="txt_Bandera_Reg" type="text" class="formcontrol" name="BanderaRegistro" name="banderaestado">
                        </div>
                        <br>

                        <div class="form-group">
                            <center>

                                <input type="submit" class="btn btn-success" value="Registrarse"> 
                                <input type="reset" class="btn btn-warning" value="Limpiar">

                            </center>
                        </div>






                    </form>
                    <br> 


                </div>
            </div>
        </div>
    </div>







</body>
</html>


<%@page import="modelo.MOVIMIENTO"%>
<%@page import="controlador.MOVIMIENTO_DAO"%>
<%@page import="modelo.PRODUCTOS"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.PRODUCTOS_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Registrar Detalle movimiento</title>
    </head>
    <body>
        <div class="modal-dialog">
            <div class="col-12">
                <div class="modal-content">
                    <div class="col-12">
                        
                        <center>
                            <h1>Registro Detalle Movimiento</h1>
                        </center>
                        <br>
                        <center> 
                            <img src="../imagenes/hojas-de-google.png" alt=""/>
                        </center>
                        <br>
                         <form class="cold-12">
                             
                             <h5 for="Id_movimiento">Movimiento</h5>
                            <input id="txt_id_movimiento_Reg" type="text" class="form-control d-none" name="id_movimiento">
                            <%
                                MOVIMIENTO_DAO mi_movimiento_dao = new MOVIMIENTO_DAO();
                                ArrayList<MOVIMIENTO> mi_lista_movimiento = mi_movimiento_dao.ConsultarListadoMovimiento("", "");
                                out.println("<select class='form-control' id='SelectMovimiento' size='1'>");
                                out.println("<option onclick='setIdmovimiento(\""+""+"\")'>" + "--Seleccione--" + "</option>");
                                for (MOVIMIENTO C : mi_lista_movimiento ){
                                
                                out.println("<option onclick='setIdmovimiento(\"" + C.getId_movimiento()+ "\")'>" + C.getNumero_de_documento() + "</option>");
                                                                
                                }
                                out.println("</select>");   
                            %>
                            <br>
                            
                            <h5 for="Id_producto">Producto</h5>
                            <input id="txt_id_producto_Reg" type="text" class="form-control d-none" name="id_producto">
                            <%
                                PRODUCTOS_DAO mi_producto_dao = new PRODUCTOS_DAO();
                                ArrayList<PRODUCTOS> mi_lista_productos = mi_producto_dao.ConsultarListadoProductos(' ', "");
                                out.println("<select class='form-control' id='SelectProducto' size='1'>");
                                out.println("<option onclick='setIdproducto(\""+""+"\")'>" + "--Seleccione--" + "</option>");
                                for (PRODUCTOS C : mi_lista_productos ){
                                
                                out.println("<option onclick='setIProducto(\"" + C.getId_producto() + "\")'>" + C.getNombre_producto() + "</option>");
                                                                
                                }
                                out.println("</select>");   
                            %>
                            <br>
                            
                            
                       
                            <h5 for="cantidad">Cantidad</h5>
                            <input id="cantidad_Reg" type="text" class="form-control" placeholder="Ingrese la cantidad">
                            <br>
                            <h5 for="precio_productos">Precio</h5>
                            <input id="precio_productos_Reg" type="text" class="form-control" placeholder="Ingrese el precio">
                            <br>
                            <h5 for="iva_productos">Iva Producto</h5>
                            <input id="iva_productos_Reg" type="text" class="form-control" placeholder="Ingrese el Iva del producto">
                            <br>
                            <h5 for="total_productos">Total Producto</h5>
                            <input id="total_productos_Reg" type="text" class="form-control" placeholder="Ingrese el total del producto">
                            
                            <br>
                            
                            <div class="form-group">

                            <center>

                                <button type="submit" class="btn btn-success">Registrarse</button>
                                <button class="btn btn-danger" onclick="location.href = '../index.html'">Volver</button>

                            </center>
                        </div>
                          
                        </form>
                        <br> 

           
                        <script src="javascript/jquery-1.11.0.min.js" type="text/javascript"></script>
                        <link href="css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    </body>
</html>

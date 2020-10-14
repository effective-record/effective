
<%@page import="modelo.INVENTARIO"%>
<%@page import="controlador.INVENTARIO_DAO"%>
<%@page import="modelo.MARCA_PRODUCTO"%>
<%@page import="controlador.MARCA_PRODUCTO_DAO"%>
<%@page import="modelo.ESTADO_PRODUCTO"%>
<%@page import="controlador.ESTADO_PRODUCTO_DAO"%>
<%@page import="modelo.CATEGORIA_PRODUCTO"%>
<%@page import="controlador.CATEGORIA_PRODUCTO_DAO"%>
<%@page import="modelo.PROVEEDORES"%>
<%@page import="controlador.PROVEEDORES_DAO"%>
<%@page import="modelo.UNIDAD_DE_MEDIDA_PRODUCTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.UNIDAD_DE_MEDIDA_PRODUCTO_DAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Registro producto</title>
    </head>

    <body>


        <div class="modal-dialog">
            <div class="col-12">
                <div class="modal-content">
                    <div class="col-12">


                        <center>
                            <h1>Registro Productos</h1>
                        </center>
                        <br>
                        <center> 
                            <img src="../imagenes/orden.png" alt=""/>
                        </center>


                        <form class="cold-12">
                            <h5 for="nombre_producto">Nombre</h5>
                            <input id="nombre_producto_Reg" type="text" class="form-control" placeholder="Ingrese el nombre del producto">
                            <br>
                            <h5 for="precio_producto">Precio</h5>
                            <input id="precio_producto_Reg" type="text" class="form-control" placeholder="Ingrese el precio del producto"> 
                            <br>
                            <h5 for="descripcion_producto">Descripcion del producto</h5>
                            <input id="descripcion_producto_Reg" type="text" class="form-control" placeholder="Ingrese la descripcion del producto"> 
                            <br>
                            <h5 for="cantidad_producto">Cantidad</h5>
                            <input id="cantidad_producto_Reg" type="text" class="form-control" placeholder="Ingrese la cantidad del producto"> 
                            <br>
                            <h5 for="iva_producto">Iva del producto</h5>
                            <input id="iva_producto_Reg" type="text" class="form-control" placeholder="Ingrese el iva del producto"> 
                            <br>

                            <h5 for="id_unidad_de_medida_producto">Unidad de medida</h5>
                            <input id="txt_id_unidad_de_medida_producto_Reg" type="text" class="form-control d-none" name="id_unidad_de_medida_producto">
                            <%
                                UNIDAD_DE_MEDIDA_PRODUCTO_DAO mi_unidad_medida_dao = new UNIDAD_DE_MEDIDA_PRODUCTO_DAO();
                                ArrayList<UNIDAD_DE_MEDIDA_PRODUCTO> mi_unidad_medida = mi_unidad_medida_dao.ConsultarListarUnidad_de_medida('1', "");
                                out.println("<select class='form-control' id='SelectUnidadDemedida' size='1'>");
                                out.println("<option onclick='setIdUnidadDeMedida(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (UNIDAD_DE_MEDIDA_PRODUCTO U : mi_unidad_medida) {

                                    out.println("<option onclick='setIdUnidadDeMedida(\"" + U.getId_unidad_de_medida_producto() + "\")'>" + U.getDescripcion_unidad_de_medida_producto() + "</option>");

                                }
                                out.println("</select>");
                            %>

                            <br>


                            <h5 for="id_proveedor">Proveedor</h5>
                            <input id="txt_id_proveedor_Reg" type="text" class="form-control d-none" name="id_proveedor">

                            <%
                                PROVEEDORES_DAO proveedor_dao = new PROVEEDORES_DAO();
                                ArrayList<PROVEEDORES> mi_proveedor = proveedor_dao.ConsultarListadoProveedor("", "");
                                out.println("<select class='form-control' id='SelectProveedor' size='1'>");
                                out.println("<option onclick='setIdProveedor(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (PROVEEDORES U : mi_proveedor) {

                                    out.println("<option onclick='setIdProveedor(\"" + U.getIdentificacion_proveedor() + "\")'>" + U.getNombre_proveedor() + "</option>");

                                }
                                out.println("</select>");

                            %>

                            <br>
                            <h5 for="id_categoria_producto">Categoria del producto</h5>
                            <input id="txt_id_categoria_producto_Reg" type="text" class="form-control d-none" name="id_categoria_producto">
                            <%                                CATEGORIA_PRODUCTO_DAO mi_Categoria_producto_dao = new CATEGORIA_PRODUCTO_DAO();
                                ArrayList<CATEGORIA_PRODUCTO> mi_Categoria_producto = mi_Categoria_producto_dao.ConsultarListadoCategoria_producto('1', "");
                                out.println("<select class='form-control' id='SelectCategoriaProducto' size='1'>");
                                out.println("<option onclick='setIdCategoriaProducto(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (CATEGORIA_PRODUCTO U : mi_Categoria_producto) {

                                    out.println("<option onclick='setIdCategoriaProducto(\"" + U.getId_categoria_producto() + "\")'>" + U.getNombre_categoria_producto() + "</option>");

                                }
                                out.println("</select>");
                            %>

                            <br>
                            <h5 for="id_estado_producto">Estado Producto</h5>
                            <input id="txt_id_estado_producto_Reg" type="text" class="form-control d-none" name="id_estado_producto">
                            <%
                                ESTADO_PRODUCTO_DAO estadoproducto_dao = new ESTADO_PRODUCTO_DAO();
                                ArrayList<ESTADO_PRODUCTO> mi_estadoproducto = estadoproducto_dao.ConsultarListadoEstadoProducto('1', "");
                                out.println("<select class='form-control' id='SelectEstadoProducto' size='1'>");
                                out.println("<option onclick='setIdEstadoProducto(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (ESTADO_PRODUCTO E : mi_estadoproducto) {

                                    out.println("<option onclick='setIdEstadoProducto(\"" + E.getId_estado_producto() + "\")'>" + E.getDescripcion_estado_producto() + "</option>");

                                }
                                out.println("</select>");

                            %>

                            <br>
                            <h5 for="id_marca_producto">Marca Producto</h5>
                            <input id="txt_id_marca_producto_Reg" type="text" class="form-control d-none" name="id_marca_producto">
                            <%                                MARCA_PRODUCTO_DAO marcaproducto_dao = new MARCA_PRODUCTO_DAO();
                                ArrayList<MARCA_PRODUCTO> mi_marcaproducto = marcaproducto_dao.ConsultarListadoMarcaProducto('1', "");
                                out.println("<select class='form-control' id='SelectMarca' size='1'>");
                                out.println("<option onclick='setIdMarcaProducto(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (MARCA_PRODUCTO M : mi_marcaproducto) {

                                    out.println("<option onclick='setIdMarcaProducto(\"" + M.getId_marca_producto() + "\")'>" + M.getNombre_marca_producto() + "</option>");

                                }
                                out.println("</select>");

                            %>

                            <br>

                            <div class="form-group">

                                <center>

                                    <button type="submit" class="btn btn-success">Registrarse</button>
                                    <button type="reset" class="btn btn-warning" onclick="">Volver</button>

                                </center>
                            </div>

                        </form>
                        <br> 




                        <script src="javascript/jquery-1.11.0.min.js" type="text/javascript"></script>
                        <link href="css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
                        </body>
                        </html>

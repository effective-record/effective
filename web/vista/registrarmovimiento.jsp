<%@page import="modelo.USUARIOS"%>
<%@page import="controlador.USUARIOS_DAO"%>
<%@page import="modelo.TIPO_DE_DOCUMENTO_CONTABLE"%>
<%@page import="controlador.TIPO_DE_DOCUMENTO_CONTABLE_DAO"%>
<%@page import="modelo.FORMAS_DE_PAGO"%>
<%@page import="controlador.FORMAS_DE_PAGO_DAO"%>
<%@page import="modelo.DETALLE_MOVIMIENTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.DETALLE_MOVIMIENTO_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Registrar movimiento</title>
    </head>
    <body>
        <div class="modal-dialog">
            <div class="col-12">
                <div class="modal-content">
                    <div class="col-12">


                        <center>
                            <h1>Registro Movimiento</h1>
                        </center>
                        <br>
                        <center> 
                            <img src="../imagenes/hojas-de-google.png" alt=""/>
                        </center>
                        <br>


                        <form class="cold-12">
                            
                            <h5 for="Id_tipo_de_documento_contable">Tipo de documento contable</h5>
                            <input id="txt_id_tipo_de_documento_contable_Reg" type="text" class="form-control d-none" name="id_tipo_de_documento_contable">
                            <%
                                TIPO_DE_DOCUMENTO_CONTABLE_DAO mi_tipo_de_documento_contable_dao = new TIPO_DE_DOCUMENTO_CONTABLE_DAO();
                                ArrayList<TIPO_DE_DOCUMENTO_CONTABLE> mi_lista_tipo_de_documento = mi_tipo_de_documento_contable_dao.ConsultarListadoTipoDocumento("", "");
                                out.println("<select class='form-control' id='SelectTipoDocumento' size='1'>");
                                out.println("<option onclick='setIdTipoD(\""+""+"\")'>" + "--Seleccione--" + "</option>");
                                for (TIPO_DE_DOCUMENTO_CONTABLE C : mi_lista_tipo_de_documento ){
                                
                                out.println("<option onclick='setIdTipoD(\"" + C.getCodigo() + "\")'>" + C.getDescripcion() + "</option>");
                                                                
                                }
                                out.println("</select>");   
                            %>
                            <br>
                            <h5 for="numero_de_documento">Numero de documento</h5>
                            <input id="numero_de_documento_Reg" type="text" class="form-control" placeholder="Ingrese el numero de documento">
                            <br>
                            
                            <h5 for="Id_usuario">Usuario</h5>
                            <input id="txt_id_usuario_Reg" type="text" class="form-control d-none" name="id_usuario">
                            <%
                                USUARIOS_DAO mi_usuario_dao = new USUARIOS_DAO();
                                ArrayList<USUARIOS> mi_lista_usuario = mi_usuario_dao.ConsultarListadoUsuario("","","");
                                out.println("<select class='form-control' id='Selectusuario' size='1'>");
                                out.println("<option onclick='setIdusuario(\""+""+"\")'>" + "--Seleccione--" + "</option>");
                                for (USUARIOS C : mi_lista_usuario ){
                                
                                out.println("<option onclick='setIdusuario(\"" + C.getId_usuario() + "\")'>" + C.getIdentificacion_usuario() + "</option>");
                                                                
                                }
                                out.println("</select>");   
                            %>
                            <br>
                            
                             <h5 for="Id_forma_de_pago">Forma de pago</h5>
                            <input id="txt_id_forma_de_pago_Reg" type="text" class="form-control d-none" name="id_forma_de_pago">
                            <%
                                FORMAS_DE_PAGO_DAO mi_forma_de_pago_dao = new FORMAS_DE_PAGO_DAO();
                                ArrayList<FORMAS_DE_PAGO> mi_lista_formas_de_pago = mi_forma_de_pago_dao.ConsultarListadoFormasdePago(1,"");
                                out.println("<select class='form-control' id='SelectFormaPago' size='1'>");
                                out.println("<option onclick='setIdForma(\""+""+"\")'>" + "--Seleccione--" + "</option>");
                                for (FORMAS_DE_PAGO C : mi_lista_formas_de_pago ){
                                
                                out.println("<option onclick='setIdForma(\"" + C.getId_forma_de_pago() + "\")'>" + C.getTipo_de_pago() + "</option>");
                                                                
                                }
                                out.println("</select>");   
                            %>
                            <br>
                            
                            
                            <h5 for="fecha">Fecha</h5>
                            <input id="fecha_Reg" type="text" class="form-control" placeholder="Ingrese la fecha"> 
                            <br>
                            <h5 for="subtotal">Subtotal</h5>
                            <input id="subtotal_Reg" type="text" class="form-control" placeholder="Ingrese el subtotal"> 
                            <br>
                            <h5 for="total_iva">Total iva</h5>
                            <input id="total_iva_Reg" type="text" class="form-control" placeholder="Ingrese el total iva"> 
                            <br>
                            <h5 for="descuento">Descuento</h5>
                            <input id="descuento_Reg" type="text" class="form-control" placeholder="Ingrese el descuento"> 
                            <br>
                            <h5 for="total_factura">Total factura</h5>
                            <input id="total_factura_Reg" type="text" class="form-control" placeholder="Ingrese el total factura"> 
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
                       
    </body>
</html>

<%@page import="modelo.GENERO_USUARIO"%>
<%@page import="controlador.GENERO_USUARIO_DAO"%>
<%@page import="modelo.TIPO_DOC_IDENTIFICACION_USUARIO"%>
<%@page import="controlador.TIPO_DOC_IDENTIFICACION_USUARIO_DAO"%>
<%@page import="modelo.TIPO_USUARIO"%>
<%@page import="controlador.TIPO_USUARIO_DAO"%>
<%@page import="modelo.ESTADO_USUARIO"%>
<%@page import="controlador.ESTADO_USUARIO_DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../javascript/jquery-1.11.0.min.js" type="text/javascript"></script>
        <script src="../javascript/objecionar_usuarios.js"></script>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>

        <title>Formulario registro usuario</title>
    </head>

    <body>

        <div class="modal-dialog">
            <div class="col-12">
                <div class="modal-content">
                    <div class="col-12">


                        <center>
                            <h1>Registro usuarios</h1>
                        </center>
                        <br>
                        <center> 
                            <img src="../imagenes/agregar-usuario.png" alt=""/>
                        </center>


                        <form action="Registrar_usuarios" method="post" onsubmit=" return objecionar_usuarios()" class="cold-12">
                            <h5 for="nombres_usuario">Nombres</h5>
                            <input id="nombres_usuario_Reg" type="text" class="form-control" placeholder="Ingrese los nombres del usuario" name="nombres">
                            <br>
                            <h5 for="apellidos_usuario">Apellidos</h5>
                            <input id="apellidos_usuario_Reg" type="text" class="form-control" placeholder="Ingrese los apellidos del usuario" name="apellidos"> 
                            <br>
                            <h5 for="telefono_usuario">Teléfono</h5>
                            <input id="telefono_usuario_Reg" type="tel" class="form-control" placeholder="Ingrese el número de teléfono del usuario" name="telefono"> 
                            <br>
                            <h5 for="direccion_usuario">Dirección</h5>
                            <input id="direccion_usuario_Reg" type="tel" class="form-control" placeholder="Ingrese la dirección de residencia del usuario" name="direccion"> 
                            <br>
                            <h5 for="correo_usuario">Correo electrónico</h5>
                            <input id="correo_usuario_Reg" type="emai" class="form-control" placeholder="Ingrese el correo electronico del usuario" name="correo"> 
                            <br>

                            <h5 for="Id_doc_identificacion_usuario">Tipo de documento de identificación del usuario</h5>
                            <input id="txt_id_doc_identificacion_usuario_Reg" type="text" class="form-control d-none" name="id_doc_identificacion_usuario">

                            <%
                                TIPO_DOC_IDENTIFICACION_USUARIO_DAO tipodocumentoDao = new TIPO_DOC_IDENTIFICACION_USUARIO_DAO();
                                ArrayList<TIPO_DOC_IDENTIFICACION_USUARIO> mitipodocumento = tipodocumentoDao.ConsultarListadoTipo_doc_usuario(' ', "");
                                out.println("<select class='form-control'id='SelectTipoDoc' size='1'>");
                                out.println("<option onclick='setIdTipo(\"" + "" + "\")'>" + "--Seleccionar--" + "</option>");
                                for (TIPO_DOC_IDENTIFICACION_USUARIO C : mitipodocumento) {
                                    out.println("<option onclick='setIdTipo(\"" + C.getId_doc_identificacion_usuario() + "\")'>" + C.getTipo_doc_identificacion_usuario() + "</option>");

                                }

                                out.println("</select>");
                            %>


                            <br>
                            <h5 for="identificacion_usuario">N°de identificacion</h5>
                            <input id="identificacion_usuario_Reg" type="text" class="form-control" placeholder="Ingrese el número de identificación del usuario" name="identificacion"> 

                            <br>
                            <h5 for="clave">Clave</h5>
                            <input id="clave_Reg" type="password" class="form-control" placeholder="Ingrese la clave de usuario" name="clave">
                            <br>
                            <h5 for="Id_tipo_usuario">Tipo de usuario</h5>
                            <input id="txt_id_tipo_usuario_Reg" type="text" class="form-control d-none" name="id_tipo_usuario">

                            <%
                                TIPO_USUARIO_DAO mi_tipo_usuario_dao = new TIPO_USUARIO_DAO();
                                ArrayList<TIPO_USUARIO> mi_tipo_usuario = mi_tipo_usuario_dao.ConsultarListarTipo_usuario(1, "");
                                out.println("<select class='form-control' id='SelectTipousuario' size='1'>");
                                out.println("<option onclick='setIdTipousuario(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (TIPO_USUARIO C : mi_tipo_usuario) {

                                    out.println("<option onclick='setIdTipousuario(\"" + C.getId_tipo_usuario() + "\")'>" + C.getDescripcion_tipo_usuario() + "</option>");

                                }
                                out.println("</select>");

                            %>
                            <br>
                            <h5 for="Id_genero_usuario">Genero de usuario</h5>
                            <input id="txt_id_genero_usuario_Reg" type="text" class="form-control d-none" name="id_genero_usuario">
                            <%                                    GENERO_USUARIO_DAO mi_genero_usuario_dao = new GENERO_USUARIO_DAO();
                                ArrayList<GENERO_USUARIO> mi_genero_usuario = mi_genero_usuario_dao.ConsultarListarGenero_usuario(1, "");
                                out.println("<select class='form-control' id='SelectGenero' size='1'>");
                                out.println("<option onclick='setIdGenerousuario(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (GENERO_USUARIO C : mi_genero_usuario) {

                                    out.println("<option onclick='setIdGenerousuario(\"" + C.getId_genero_usuario() + "\")'>" + C.getDescripcion_genero_usuario() + "</option>");

                                }
                                out.println("</select>");
                            %>
                            <br>
                            <h5 for="Id_estado_usuario">Estado usuario</h5>
                            <input id="txt_estado_usuario_Reg" type="text" class="form-control d-none" name="id_estado_usuario">
                            <%
                                ESTADO_USUARIO_DAO mi_estado_usurio_dao = new ESTADO_USUARIO_DAO();
                                ArrayList<ESTADO_USUARIO> mi_estado_usurio = mi_estado_usurio_dao.ConsultarListarEstado_usuario(1, "");
                                out.println("<select class='form-control' id='SelectEstado' size='1'>");
                                out.println("<option onclick='setIdEstadousuario(\"" + "" + "\")'>" + "--Seleccione--" + "</option>");
                                for (ESTADO_USUARIO C : mi_estado_usurio) {

                                    out.println("<option onclick='setIdEstadousuario(\"" + C.getId_estado_usuario() + "\")'>" + C.getDescripcion_estado_usuario() + "</option>");

                                }
                                out.println("</select>");

                            %>
                            <br>
                            <div id=ControlRegistro" class="bd-example">
                                <input id="txt_Bandera_Reg" type="text" class="formcontrol" name="BanderaRegistro">
                            </div>
                            <br>

                            <div class="form-group">
                                <center>

                                    <input type="submit" class="btn btn-success" value="Registrarse"> 
                                    <input type="reset" class="btn btn-warning" value="Limpiar">

                                </center>
                                <br>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>

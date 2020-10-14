function objecionar_usuarios(){
    
    var resultado = "Correcto";
    var Nombres = $('#nombres_usuario_Reg').val();
    var Apellidos = $('#apellidos_usuario_Reg').val();
    var Telefono = $('#telefono_usuario_Reg').val();
    var Direccion= $('#direccion_usuario_Reg').val();
    var correo = $('#correo_usuario_Reg').val();
    var Identificacion = $('#identificacion_usuario_Reg').val();
    var Clave = $('#clave_Reg').val();
    var Tipo_documento = $('#txt_id_tipo_documento_Reg').val();
    var Tipo_usuario = $('#txt_id_tipo_usuario_Reg').val();
    var Genero_usuario = $('#txt_txt_id_genero_usuario_Reg').val();
    var Estado_usuario = $('#txt_estado_usuario_Reg').val();
    
    
    console.log("-- Información a validar --");
    console.log("Nombres : " + Nombres);
    console.log("Apellidos : " + Apellidos);
    console.log("Telefono : " + Telefono);
    console.log("Direccion : " + Direccion);
    console.log("correo : " + correo);
    console.log("identificacion : " + Identificacion);
    console.log("clave : " + Clave);
    console.log("Tipo documento : " + Tipo_documento);
    console.log("Tipo usuario : " + Tipo_usuario);
    console.log("Genero usuario : " + Genero_usuario);
    console.log("Estado usuario : " + Estado_usuario);
    
    if(Nombres == ''){
        
        alert("Los nombres del usuario no pueden ser nulos");
        resultado = 'Error';
        
    }else if(Apellidos == ''){
        
        alert("Los apellidos del usuario no pueden ser nulos");
        resultado = 'Error';
        
    }else if(Telefono == ''){
        
        alert("El telefono del usuario no puede ser nulo");
        resultado = 'Error';
        
    }else if(Direccion == ''){
        
        alert("La dirección del usuario no puede ser nula");
        resultado = 'Error';
        
    }else if(correo == ''){
        
        alert("El correo del usuario no puede ser nulo");
        resultado = 'Error';
        
    }else if(Identificacion == ''){
        
        alert("La identificación del usuario no puede ser nula");
        resultado = 'Error';
        
    }else if(Clave == ''){
        
        alert("La clave del usuario no puede ser nula");
        resultado = 'Error';
        
        
    }else if(Tipo_documento == ''){
        
        alert("El tipo de documento del usuario no puede ser nulo");
        resultado = 'Error';
        
        
    }else if(Tipo_usuario == ''){
        
        alert("El tipo de usuario no puede ser nulo");
        resultado = 'Error';
        
        
    }else if(Genero_usuario == ''){
        
        alert("El estado del usuario no puede ser nulo");
        resultado = 'Error';
        
        
    }else if(Estado_usuario == ''){
        
        alert("El estado de usuario no puede ser nulo");
        resultado = 'Error';
        
    }else if(isNAN(Identificacion)){
        
        alert("La identificacion de usuario debe ser numerica");
        resultado = 'Error';
        
    }else if (isNAN(Telefono)){
        
        alert("El telefono debe ser numerico");
        resultado = 'Error';
        
    }else{
        
        resultado = 'Error';
    }
    
    $('#txt_Bandera_Reg').val(resultado);
    console.log("Resultado : " + $('#txt_Bandera_Reg').val());
    
    if (resultado == 'Correcto'){
        
        return true;
    }else{
        
        return false;
    }
}   

function setIdTipo(x){
    $('#txt_id_doc_identificacion_usuario_Reg').val(x);
    console.log("valor : " + x);
    
}

function setIdTipousuario(x){
    $('#txt_id_tipo_usuario_Reg').val(x);
    console.log("valor : " + x);
    
}
function setIdGenerousuario(x){
    $('#txt_id_genero_usuario_Reg').val(x);
    console.log("valor : " + x);
    
}

function setIdEstadousuario(x){
    $('#txt_estado_usuario_Reg').val(x);
    console.log("valor : " + x);    
}
 

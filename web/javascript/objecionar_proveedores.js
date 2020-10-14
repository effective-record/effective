var buscar;

function objecionar_proveedores() {

    var resultado = "Correcto";
    var Identificacion = $("#txt_identificacion_reg").val();
    var Nombre = $("#txt_nombre_reg").val();
    var Correo = $("#txt_correo_reg").val();
    var Direccion = $("#txt_direccion_reg").val();
    var Telefonouno = $("#txt_telefonouno_Reg").val();
    var Telefonodos = $("#txt_telefonodos_Reg").val();

    console.log("-- Información a validar --");
    console.log("Identificacion : " + Identificacion);
    console.log("Nombre : " + Nombre);
    console.log("Correo : " + Correo);
    console.log("Direccion : " + Direccion);
    console.log("Telefonouno : " + Telefonouno);
    console.log("Telefonodos : " + Telefonodos);

    if (Identificacion == '') {

        alert("La identificacion del proveedor no puede ser nula");
        resultado = 'Error';


    } else if (Nombre == '') {

        alert("El nombre del proveedor no puede ser nulo");
        resultado = 'Error';


    } else if (Correo == '') {

        alert("El correo del proveedor no puede ser nulo");
        resultado = 'Error';


    } else if (Direccion == '') {

        alert("La direccion del proveedor no puede ser nula");
        resultado = 'Error';


    } else if (Telefonouno) {

        alert("El telefono uno del proveedor no puede ser nulo");
        resultado = 'Error';





    }else if(isNAN(Identificacion)){
        
        alert("La identificacion del proveedor debe ser numerica");
        resultado = 'Error';
        
    }else if(isNAN(Telefonouno)){
        
        alert("El telefono 1 debe ser numerico");
        resultado = 'Error';
        
    }else{
        
        resultado = 'Error';
    }
    
    $('#txt_Bandera_Reg').val(resultado);
    console.log("Resultado : " + $('#txt_Bandera_Reg').val());
    
    if(resultado == 'Correcto'){
        
        return true;
        
    }else{
        
        return false;
    }
}
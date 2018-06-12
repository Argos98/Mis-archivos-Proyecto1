/*
Responsabilidades del controlador
    - Leer datos de la interfaz
    - Imprimir datos dentro de la interfaz
    - Validar datos (formularios)
    - Responder a eventos (click, change, keyup...)
    - Se comunica con el servicio, cuando se requiera algún procesamiento de datos
*/

'use strict';
let botonRegistrar = document.querySelector('#btnRegistrar');

botonRegistrar.addEventListener('click', obtenerDatos);

let inputNombre = document.querySelector('#txtNombre');
let inputEmail = document.querySelector('#txtEmail');
let inputTelefono = document.querySelector('#txtTelefono');
let inputEdad = document.querySelector('#txtEdad');
let inputContrasenna = document.querySelector('#txtContrasenna');
let inputConfirmacion = document.querySelector('#txtConfirmacion');

function obtenerDatos() {
    let infoPersona = [];
    let bError = false;

    let sNombre = inputNombre.value;
    let sEmail = inputEmail.value;
    let sTelefono = inputTelefono.value;
    let nEdad = Number(inputEdad.value);
    let sContrasenna = inputContrasenna.value;
    let sConfirmacion = inputConfirmacion.value;

    infoPersona.push(sNombre, sEmail, sTelefono, nEdad, sContrasenna);

    bError = validar();
    if (bError == true) {
        console.log('No se pudo registrar el usuario');
    } else {
        registrarPersona(infoPersona);
        imprimirListaPersonas();
    }

};
function imprimirListaPersonas() {
    let listaPersonas = obtenerListaPersonas();
    let tbody = document.querySelector('#tblPersonas tbody');
    tbody.innerHTML = '';

    for (let i = 0; i < listaPersonas.length; i++) {
        let fila = tbody.insertRow();

        let cNombre = fila.insertCell();
        let cEmail = fila.insertCell();
        let cTelefono = fila.insertCell();
        let cEdad = fila.insertCell();

        cNombre.innerHTML = listaPersonas[i][0];
        cEmail.innerHTML = listaPersonas[i][1];
        cTelefono.innerHTML = listaPersonas[i][2];
        cEdad.innerHTML = listaPersonas[i][3];
    }

};

function validar() {
    console.log('dentro de la funcion validar ');
    let bError = false;

    let regexSoLetras = /^([A-Za-zñáéíóú ])+$/;
    let regexSoNumeros =/^[0-9]{1,3}+$/;


    if (inputNombre.value == '' || (regexSoLetras.test(inputNombre.value)==false)) {
        inputNombre.classList.add('error_input');


        bError = true;
    } else {
        inputNombre.classList.remove('error_input');
    }

    //Validación del correo
    if (inputEmail.value == '') {
        inputEmail.classList.add('error_input');
        bError = true;
    } else {
        inputEmail.classList.remove('error_input');
    }
    //Validación del teléfono
    if (inputTelefono.value == '') {
        inputTelefono.classList.add('error_input');
        bError = true;
    } else {
        inputTelefono.classList.remove('error_input');
    }

    //Validacion edad 
    if (inputEdad.value == ''||(regexSoNumeros.test(inputEdad.value)==false)) {
        inputEdad.classList.add('error_input');
        bError = true;
    } else {
        inputEdad.classList.remove('error_input');
    }

    //validar contrasenia vacia

    if (inputContrasenna.value == '') {
        inputContrasenna.classList.add('error_input');
        bError = true;
    } else {
        inputContrasenna.classList.remove('error_input');
    }


    if(inputContrasenna.value != inputConfirmacion.value){
        inputContrasenna.classList.add('error_input');
        inputConfirmacion.classList.add('error_input');
        bError = true;
    }else{
        inputContrasenna.classList.remove('error_input');
        inputConfirmacion.classList.remove('error_input'); 
    }






    return bError;
};
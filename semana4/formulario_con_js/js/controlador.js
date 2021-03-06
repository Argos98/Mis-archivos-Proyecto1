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

let inputNombre = document.querySelector('#txtNombre');
let inputEmail = document.querySelector('#txtEmail');
let inputEmail = document.querySelector('#txtEmail');
let inputTelefono = document.querySelector('#txtTelefono');
let inputEdad = document.querySelector('#txtEdad');
let inputContrasenna = document.querySelector('#txtContrasenna');
let inputConfirmacion = document.querySelector('#txtConfirmacion');



botonRegistrar.addEventListener('click', obtenerDatos);

function obtenerDatos() {
    let infoPersona = [];
    let berror;



    let sNombre = inputNombre.value;


    let sEmail = inputEmail.value;


    let sTelefono = inputTelefono.value;


    let nEdad = Number(inputEdad.value);


    let sContrasenna = inputContrasenna.value;


    let sConfirmacion = inputConfirmacion.value;

    infoPersona.push(sNombre, sEmail, sTelefono, nEdad, sContrasenna);

    berror = validar();
    if (berror = true) {
        console.log('No se pudo registrar el usuario')
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


    function validar() {

        let bError = false;


        return bError;
    }

};
'use strict';

let botonRegistrar = document.querySelector('#btnRegistrar');

let inputNombreLista = document.querySelector('#txtNombreLista');
let inputFecha = document.querySelector('#dtFecha');


botonRegistrar.addEventListener('click', obtenerDatos);

function obtenerDatos() {

    let infoLista = [];
    let error;


    let sNombreLista = inputNombreLista.value;

    let dFecha = inputFecha.value;

    infoLista.push(sNombreLista, dFecha);


    error = validarCampos();
    if (error == true) {
        console.log('no se puede registrar');

    } else {
        RegistrarLista(infoLista);
    }




}

function validarCampos() {
    let error = false;

    if (inputNombreLista.value == '') {
        inputNombreLista.classList.add('error_input');
        error = true;
    } else {
        inputNombreLista.classList.remove('error_input');
    }

    if (inputFecha.value == '') {
        inputFecha.classList.add('error_input');
        error = true;
    } else {
        inputFecha.classList.remove('error_input');
    }

    return error;
}

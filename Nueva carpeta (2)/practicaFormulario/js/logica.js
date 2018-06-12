

// let Reservar espacio dentro de la memoria para una estructura especifica
// const reserva espacio en la memoria para un valor que no cambiará al ejecutar lógica

let botonRegistrar = document.querySelector('#btnRegistrar');
botonRegistrar.addEventListener('click', obtenerDatosUsuario);

console.log(botonRegistrar);


function obtenerDatosUsuario () {
   let nombre = document.getElementById('txtNombre').value;
   let apellido = document.querySelector('#txtApellido').value;
   let correo = document.querySelector('#txtEmail').value;
   let contrasenna = document.querySelector('#txtContrasenna').value;
   let confirmacion = document.querySelector('#txtConfirmacion').value;

   console.log(nombre, apellido, correo, contrasenna, confirmacion);
}

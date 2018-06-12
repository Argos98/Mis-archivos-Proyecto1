//let reserva espacios dentro de memoria para una estructura especifica 


let botonRegistrar = document.querySelector('#btnRegistrar')

botonRegistrar.addEventListener('click', obtenerDatosUsuario);


function obtenerDatosUsuario () {

    let nombre = document.querySelector('#txtNombre').value;

    let apellido = document.querySelector('#txtApellido').value;

    let correo = document.querySelector('#txtEmail').value;

    let contrasenia = document.querySelector('#txtContrasenia').value;

    let confirmacion = document.querySelector('#btnRegistrar').value;

    console.log(nombre,apellido,correo,contrasenia,confirmacion);

    
}
'use strict';

const userModel = require('./users.model');

module.exports.registrar = function (req, res) {
    let nuevoUsuario = new userModel({

        nombre_completo: req.body.nombre_completo,
        correo: req.body.correo,
        telefono: req.body.telefono,
        edad: req.body.edad,
        contrasenna: req.body.contrasenna

    });

    nuevoUsuario.save(function (error) {
        if (error = true) {
            res.json({ success: false, mjs: 'El Usurio no puedo ser registrado, ocurrio el sigiente error' + error })
        } else {
            res.json({ success: true, mjs: 'El Usuraio fue registrado con exito' })
        }
    });
};
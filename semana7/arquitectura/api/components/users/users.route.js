'use strict';

const express = require('express');
const router = express.Router();
const users = require('./users.api');

router.router('/registrar_usuario')
    .post(function (req, res) {
        users.registrar(req, res);
    });











module.exports = router;
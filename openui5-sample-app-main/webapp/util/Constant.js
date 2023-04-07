sap.ui.define([],
    function() {
        'use strict';
    
        var constants = {
            DEST_BACKEND: 'http://localhost:8081',
            ENDPOINTS: {
                Appuntamento: {
                    getAll: "/appuntamento/getAll",
                    get: "/appuntamento/get",
                    add: "/appuntamento//add"
                },
                Utente: {
                    getAll: "/utente/getAll",
                    get: "/utente/get",
                    add: "/utente/add"
                },
                Centro: {
                    getAll: "/centro/getAll",
                    get: "/centro/get",
                    add: "/centro/add"
                },
                Prodotto: {
                    getAll: "/prodotto/getAll",
                    get: "/prodotto/get",
                    add: "/prodotto/add"
                },
                Ruolo: {
                    getAll: "/ruolo/getAll",
                    get: "/ruolo/get",
                    add: "/ruolo/add"
                },
                Servizio: {
                    getAll: "/servizio/getAll",
                    get: "/servizio/get",
                    add: "/servizio/add"
                }
            }
        };
    
        return constants;
    });
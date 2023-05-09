sap.ui.define([
	"sap/ui/Device",
	"sap/ui/core/mvc/Controller",
	"sap/ui/demo/todo/controller/BaseController",
	"sap/ui/model/Filter",
	"sap/ui/model/FilterOperator",
	"sap/ui/model/json/JSONModel",
	"sap/m/Dialog",
	"sap/m/Label",
	"sap/m/Input",
	"sap/m/Button",
	"sap/m/library",
], function(Device, Controller, BaseController, Filter, FilterOperator, JSONModel, Dialog, Label, Input, Button, mobileLibrary) {
	"use strict";
// shortcut for sap.m.ButtonType
var ButtonType = mobileLibrary.ButtonType;

// shortcut for sap.m.DialogType
var DialogType = mobileLibrary.DialogType;
	return BaseController.extend("sap.ui.demo.todo.controller.Register", {

		onInit: function() {
			this.aSearchFilters = [];
			this.aTabFilters = [];

			this.getView().setModel(new JSONModel({
				isMobile: Device.browser.mobile,
				filterText: undefined
			}), "view");
		},

		
		onPressRegister: async function(oEvent) {
			var nome = this.getView().byId("nameInput").getValue();
			var surname = this.getView().byId("surnameInput").getValue();	 
			var email = this.getView().byId("emailInput").getValue();
			var telNumber = this.getView().byId("telnumberInput").getValue();	
			var username = this.getView().byId("usernameInput").getValue();	
			var password = this.getView().byId("passwordInput").getValue();
			var passwordCheck = this.getView().byId("passwordInputCheck").getValue();	
			
			if (password === passwordCheck) {
				var authCode = "";
				var that = this;
				if (!this.oDefaultDialog) {
					this.oDefaultDialog = new Dialog({
						title: "Verification Code",
						content: [
							new Label({
								text: "Inserisci il codice di verifica inviato alla tua mail.",
								labelFor: "submissionNote"
							}),
							new Input("submissionNote", {
								placeholder: "Your code",
								with: "18rem",
								id: "idAuthCode",
								liveChange: function(oEvent) {
									authCode = oEvent.getParameter("value");

								}.bind(this)
							})
						],
						beginButton: new Button({
							type: ButtonType.Emphasized,
							text: "Conferma",
							press: async function () {
								var jsonRegister = {
									"name": nome,
									"surname": surname,
									"email": email,
									"telNumber": telNumber,
									"username": username,
									"password": password
								}
								var response = await that.callDatabaseMethods("utente/add", "POST", jsonRegister);
								if (response === "OK") {
									response = await that.callDatabaseMethods("utente/doAdd?code=" + authCode, "POST", jsonRegister);
								}
								if (response === "OK") {
									this.oDefaultDialog.close();
									var oRouter = sap.ui.core.UIComponent.getRouterFor(that);
									oRouter.navTo("Login");
								}
							}.bind(this)
						}),
						endButton: new Button({
							text: "Annulla",
							press: function () {
								this.oDefaultDialog.close();
							}.bind(this)
						})
						}),
					this.getView().addDependent(this.oDefaultDialog);
				}
				this.oDefaultDialog.open();
			}
			
		}


	})
});

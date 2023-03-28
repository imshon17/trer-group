sap.ui.define([
	"sap/ui/Device",
	"sap/ui/core/mvc/Controller",
	"sap/ui/demo/todo/controller/BaseController",
	"sap/ui/model/Filter",
	"sap/ui/model/FilterOperator",
	"sap/ui/model/json/JSONModel"
], function(Device, Controller, BaseController, Filter, FilterOperator, JSONModel) {
	"use strict";

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
				var jsonRegister = {
					"name": nome,
					"surname": surname,
					"email": email,
					"telNumber": telNumber,
					"username": username,
					"password": password 
				}
				var response = await this.callDatabaseMethods("utente/add", "POST", jsonRegister);
				if (response === "OK") {
					console.log("created");
					var oRouter = sap.ui.core.UIComponent.getRouterFor(this);
					oRouter.navTo("Login");
				}
			}
			
		}


	})
});

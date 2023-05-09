sap.ui.define([
	"sap/ui/Device",
	"sap/ui/core/mvc/Controller",
	"sap/ui/demo/todo/controller/BaseController",
	"sap/ui/model/Filter",
	"sap/ui/model/FilterOperator",
	"sap/ui/model/json/JSONModel"
], function(Device, Controller, BaseController, Filter, FilterOperator, JSONModel) {
	"use strict";

	return BaseController.extend("sap.ui.demo.todo.controller.Login", {

		onInit: function() {
			this.aSearchFilters = [];
			this.aTabFilters = [];

			this.getView().setModel(new JSONModel({
				isMobile: Device.browser.mobile,
				filterText: undefined
			}), "view");
		},

		
		onPressLogin: async function(oEvent) {
			var username = this.getView().byId("usernameInput").getValue();
			var password = this.getView().byId("passwordInput").getValue();	 
			var utente = await this.callDatabaseMethods("utente/getLogin/" + username + "/" + password, "GET", null);
			var oRouter = sap.ui.core.UIComponent.getRouterFor(this);
			oRouter.navTo("Home", {
				idUtente: utente.idUtente
			});
		},

		onPressRegister: function(oEvent) {
			var oRouter = sap.ui.core.UIComponent.getRouterFor(this);
			oRouter.navTo("Register");
		}




	})
});

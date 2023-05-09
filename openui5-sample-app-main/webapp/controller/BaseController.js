sap.ui.define([
	"sap/ui/Device",
	"sap/ui/core/mvc/Controller",
	"sap/ui/model/Filter",
	"sap/ui/model/FilterOperator",
	"sap/ui/model/json/JSONModel"
], function(Device, Controller, Filter, FilterOperator, JSONModel) {
	"use strict";

	return Controller.extend("sap.ui.demo.todo.controller.BaseController", {

		onInit: function() {
			this.aSearchFilters = [];
			this.aTabFilters = [];

			this.getView().setModel(new JSONModel({
				isMobile: Device.browser.mobile,
				filterText: undefined
			}), "view");			
		},


		callDatabaseMethods: async function(sDest, sType, data) {
			var sReturn = null;
			switch (sType) {
				case "GET":
					await fetch("http://localhost:8081/" + sDest)
						.then(res=>res.json())
						.then((result) => {sReturn = result})
						.catch((error) => {sReturn = "KO"});
					break;
				case "POST":
					await fetch("http://localhost:8081/" + sDest, {
						method: sType,
						headers: {"Content-Type": "application/json"},
						body:JSON.stringify(data)
					}).then(() => {
						sReturn = "OK"
					}).catch(() => {
						sReturn = "KO";
					});
					break;			
			}
			return sReturn === null ? "" : sReturn;
		}
		


	})
});

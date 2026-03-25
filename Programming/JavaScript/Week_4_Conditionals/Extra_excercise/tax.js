"use strict";

function calculateTax() {

    let income = Number(document.getElementById("income").value);
    let age = Number(document.getElementById("age").value);
    let broadcastingTaxAmount = (income-15150) * 2.5/100;
    let result = "";

    if (age < 18 || income < 15150) {
        broadcastingTaxAmount = 0; 
    } else {
        if (broadcastingTaxAmount > 160) {
            broadcastingTaxAmount = 160;
        } else {
            broadcastingTaxAmount;
        }
        
    }
    result += "Public broadcasting tax is " + broadcastingTaxAmount.toFixed(2) + " euros";
    document.getElementById("result").innerHTML = result;

}
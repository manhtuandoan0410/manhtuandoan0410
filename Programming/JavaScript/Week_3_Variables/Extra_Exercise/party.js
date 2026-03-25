"use strict";

// Function to call on button click
function calculate()  {

    var guests = Number(document.getElementById("guests").value);
    var bottlePrice = parseFloat(document.getElementById("bottle_price").value);
    var cateringUnitPrice = parseFloat(document.getElementById("catering_unit_price").value);

    var bottleRequired = Math.ceil(guests/7);
    var drinkCost = bottlePrice * bottleRequired;
    var cateringCost = cateringUnitPrice * guests;
    var totalCost = drinkCost + cateringCost;

    var outputText = `Bottles required: ${bottleRequired} euros <br> Drink cost: ${drinkCost.toFixed(2)} euros <br> Catering cost: ${cateringCost} euros <br> Total cost: ${totalCost.toFixed(2)} euros`;

    document.getElementById("result").innerHTML = outputText;
}
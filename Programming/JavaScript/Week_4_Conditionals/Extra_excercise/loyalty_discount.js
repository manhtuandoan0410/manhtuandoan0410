"use strict";

function calculateDiscount() {
    var purchases = Number(document.getElementById("purchases").value);
    var discountRate;
    
    if (purchases < 300) {
        discountRate = 2/100;
    } else if (purchases >= 300 && purchases < 600) {
        discountRate = 3/100;
    } else { discountRate = 4/100;}

    var discountAmount = purchases * discountRate;
    var discountedPrice = purchases - discountAmount;

    var result = `Discount is ${discountAmount.toFixed(2)} €. Price after discount is ${discountedPrice.toFixed(2)} €`;

    document.getElementById("result").innerHTML = result;
}
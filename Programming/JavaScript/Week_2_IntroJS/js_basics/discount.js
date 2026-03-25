"use strict";

// Define/create/write a function that would be called on a button click
function calculate() {
    var inputPrice = Number(document.getElementById("price").value);
    var discountRate = Number(document.getElementById("percentage").value);
    var discountedPrice = inputPrice * (100 - discountRate) / 100;

    document.getElementById("result").innerHTML = discountedPrice;
}
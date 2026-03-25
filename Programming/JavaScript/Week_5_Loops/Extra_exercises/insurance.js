"use strict";

function showInstallments() {

    const insurancePayment = Number(document.getElementById("insurancePayment").value);
    const numberOfInstallments = Number(document.getElementById("numberOfInstallments").value);

    let monthlyPayment = insurancePayment / numberOfInstallments;
    let text = "";

    for (var i = 1; i <= numberOfInstallments; i++) {

        text += i + "." + monthlyPayment.toFixed(2) + " euros <br>";

    }

    /* 
    let i = 1;
    while (i <= numberOfInstallment) {
    text += ...;
    i++;
    }
    */

    document.getElementById("result").innerHTML = text;

}
"use strict";

function showInstallments() {

    const price = Number(document.getElementById("price").value);
    const months = Number(document.getElementById("months").value);

    let monthlyPay = price / months;
    let remainingPrice = price - monthlyPay;
    let text = "";
    
    for (let i = 1; i <= months; i++) {
        remainingPrice = price - monthlyPay*i;
        text += "Month " + i + " Payment " + monthlyPay.toFixed(2) + " euros, remaining credit: " + remainingPrice.toFixed(2) + " euros<br>";
    }

    document.getElementById("result").innerHTML = text;
}

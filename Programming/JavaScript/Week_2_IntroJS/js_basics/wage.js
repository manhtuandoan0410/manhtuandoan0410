"use strict";

// Function to call on button click
function calculate() {
    var workingHours = Number(document.getElementById("hours").value);
    var hourlyRate = Number(document.getElementById("rate").value);
    var totalWage = workingHours * hourlyRate;

    document.getElementById("result").innerHTML= `Total wage: ${totalWage.toFixed(2)} €`;
}
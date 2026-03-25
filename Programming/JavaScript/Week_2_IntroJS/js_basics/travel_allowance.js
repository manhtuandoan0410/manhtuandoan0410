"use strict";

// Function to call on button click
function calculate() {

  // Read input
var inputDistance = Number(document.getElementById("distance").value);
  // Produce result
var travelAllowance = inputDistance * 0.42;
  // Write result to document
document.getElementById("answer").innerHTML= `Payable ${travelAllowance.toFixed(2)} euros.`;
}
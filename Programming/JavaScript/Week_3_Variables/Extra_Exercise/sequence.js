"use strict";

// Function to call on button click
function calculate() {

    var firstTerm = Number(document.getElementById("first_term").value);
    var lastTerm = Number(document.getElementById("last_term").value);
    var numberOfTerms = Number(document.getElementById("number_of_terms").value);

    var sum = numberOfTerms * (firstTerm + lastTerm)/2

    document.getElementById("result").innerHTML = `The sum is ${sum}`;

}
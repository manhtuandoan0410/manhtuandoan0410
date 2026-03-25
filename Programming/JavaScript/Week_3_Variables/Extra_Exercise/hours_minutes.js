"use strict";

// Function to call on button click
function calculate() {

    var totalMinutes = Number(document.getElementById("total_minutes").value);

    var hour = Math.floor(totalMinutes / 60);
    var roundUphour = Math.ceil(totalMinutes/60)
    var remainMinutes = totalMinutes%60;

    var outputTime = `The time is ${hour} hours ${remainMinutes} minutes. <br>`;
    var roundUp = `Rounded to next full hour ${roundUphour} hours.`;

    document.getElementById("answer").innerHTML = outputTime;
    document.getElementById("answer_rounded").innerHTML = roundUp;

}
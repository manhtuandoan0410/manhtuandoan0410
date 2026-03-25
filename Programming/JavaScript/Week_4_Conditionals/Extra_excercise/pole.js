"use strict";

function calculatePoleLength() {

    var playerHeight = Number(document.getElementById("height").value);
    let playerSport = document.getElementById("sport").value;
    let recommendedPoleLength;

    if (playerSport === "Skating skiing") {
        recommendedPoleLength = playerHeight* 0.9;
    } else if (playerSport == "Classic skiing") {
         recommendedPoleLength = playerHeight* 0.85;
    } else { recommendedPoleLength = playerHeight* 0.68;}

    document.getElementById("result").innerHTML = `Recommended pole length: ${recommendedPoleLength.toFixed(0)} cm`;


}
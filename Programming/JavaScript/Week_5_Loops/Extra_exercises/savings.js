"use strict";

function showSavingsGrowth() {

const goal = Number(document.getElementById("goal").value);
const monthlySaving = Number(document.getElementById("monthly").value);

let count = Math.round(goal / monthlySaving);
// if (monthlySaving*count < goal) {
//     count = count + 1;
// }

let text = "";

for (let i = 1; i <= count; i++) {
    
    if (monthlySaving * count < goal) {
        count++;
    }

    let monthly = monthlySaving * i;
    text += "Month " + i + ": Saved " + monthly.toFixed(2) + " euros.<br>"

}

document.getElementById("result").innerHTML = text;

}
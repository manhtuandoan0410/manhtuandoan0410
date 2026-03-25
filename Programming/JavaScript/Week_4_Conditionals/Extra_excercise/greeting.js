"use strict";

function greet() {

    let time = Number(document.getElementById("hour").value);
    let greeting = "";
    // if (time < 0 || time > 24) {alert("please input the number from 0 to 23")}
   
    // if (time >= 6 && time <12) {
    //     greeting += "Good morning";
    // } else if (time > 12 && time <19) {
    //     greeting += "Good afternoon";
    // } else if (time > 19 && time <=23) {
    //     greeting += "Good evening";
    // } else {greeting += "Good night";}

    if (time < 6 || time > 23) {
        greeting = "Good night";
    } else if (time <=11) {
        greeting = "Good morning";
    } else if (time <= 18) {
        greeting = "Good afternoon";
    } else {greeting = "Good evening";}

    
    document.getElementById("result").innerHTML = greeting;
}
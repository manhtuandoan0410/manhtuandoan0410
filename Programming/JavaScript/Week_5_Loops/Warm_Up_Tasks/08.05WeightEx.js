// The idea of the code

// function showWeightGoals() { 
//     // read the original weight to a variable 
//     // calculate how many kgs one should get lighter each week = weight * 0.1 / 7
//     // initialize output text variable to start from empty text: "" 
//     // it will be used later to gather all the output lines. (String can hold also line breaks) 
    
//     // for (var i = 1; i <= 7; i++) { 
//      	// give the weight variable a new value which is weight after last
//         // measurement reduced by the how much to lose this week.
//         // add this week’s text + line break to the output text variable 
//     } 

    
//     // write the whole output text to the HTML page at once 

// }
function showWeightGoals() {
	let originalWeight = parseFloat(document.getElementById("weight").value);
	let weightLossPerWeek = (originalWeight * 0.1) / 7;
	let outputText = "" ;
	let weight = originalWeight;

	for (let i = 1; i <= 7; i++) {
		weight = weight - weightLossPerWeek;
		outputText += "After " + i + ". week " + weight.toFixed(1) + " kg<br>";
	}
	document.getElementById("answer").innerHTML= outputText;
}

// function showWeightGoals() {
//       // read the original weight to a variable
//       let originalWeight = parseFloat(document.getElementById("weight").value);

//       // calculate how many kgs one should get lighter each week
//       let weeklyLoss = originalWeight * 0.1 / 7;

//       // initialize output text variable
//       let outputText = "";

//       // copy the weight for tracking
//       let currentWeight = originalWeight;

//       // loop through 7 weeks
//       for (let i = 1; i <= 7; i++) {
//         currentWeight = currentWeight - weeklyLoss;
//         outputText += "After " + i + ". week " + currentWeight.toFixed(2) + " kg<br>";
//       }

//       // write the whole output text to the HTML page at once
//       document.getElementById("answer").innerHTML = outputText;
//     }
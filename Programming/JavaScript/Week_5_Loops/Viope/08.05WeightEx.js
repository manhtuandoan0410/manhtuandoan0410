function showWeightGoals() {
	let originalWeight = parseFloat(document.getElementById("weight").value);
	let weightLossPerWeek = (originalWeight * 0.1) / 7;
	let outputText ="";
	let weight = originalWeight;

	for (let i = 1; i <= 7; i++) {
		weight = weight - weightLossPerWeek;
		outputText += "After " + i + ". week " + weight.toFixed(1) + " kg<br>";
	}
	document.getElementById("answer").innerHTML= outputText;
}
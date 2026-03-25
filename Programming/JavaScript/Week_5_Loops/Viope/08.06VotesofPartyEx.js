function showComparisonScores() {

	var votes = Number(document.getElementById("votes").value);
	var candidates = Number(document.getElementById("candidates").value);
	
	var result = "";
	// For each candidates
			// Calculate comparison score for candidate
	for (let i = 1; i <= candidates; i++) {
		let comparisonScores = votes/i;

		result += i + ". candidate: " + comparisonScores.toFixed(0) + "<br>";
	}
		document.getElementById("answer").innerHTML = result;
		
}
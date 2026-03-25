function tellInfractionFine() {
	var drivingSpeed = Number(document.getElementById("drivingSpeed").value);
	var speedLimit = Number(document.getElementById("speedLimit").value);
	var excessSpeed = drivingSpeed - speedLimit;
	
	if (excessSpeed > 20) {
		document.getElementById("answer").innerHTML = "Income-based unit fine.";
	} else if (excessSpeed > 0 && excessSpeed <= 15) {
		if (speedLimit <= 60) {
			document.getElementById("answer").innerHTML = "Infraction fine is 85 euros.";
		} else {
			document.getElementById("answer").innerHTML = "Infraction fine is 70 euros.";
		}
	} else if (excessSpeed > 15 && excessSpeed <= 20) {
		if (speedLimit <= 60) {
			document.getElementById("answer").innerHTML = "Infraction fine is 115 euros.";
		} else {
			document.getElementById("answer").innerHTML = "Infraction fine is 100 euros.";
		}
	} else {
		document.getElementById("answer").innerHTML = "No speeding, no fine.";
	}
}

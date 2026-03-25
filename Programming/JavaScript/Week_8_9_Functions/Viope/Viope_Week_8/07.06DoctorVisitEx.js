// Defne a function (1.) 
function getKelaReimbursement (lengthOfVisit) {

	lengthOfVisit = parseInt(lengthOfVisit);

	if (lengthOfVisit <= 10) {
			return 8.00;
		} else if (lengthOfVisit <= 20) {
			return 11.00;
		} else if (lengthOfVisit <= 30) {
			return 13.50;
		} else if (lengthOfVisit <= 45) {
			return 16.50;
		} else { return 21.00}

}
// Defne a function (2.) 
function payableFee(doctorsFee, kelaReimbursement) {

	return doctorsFee - kelaReimbursement;

}
	
// Define a function (3.) 
function calculate() {
		// Read values from the input fields
		let officeFee = 15.90;
		let length = Number(document.getElementById("length").value);
		let doctorsFee = parseFloat(document.getElementById("doctorsFee").value);
		// Call the function (1.) which calculates Kela reimbursement 
		let kelaReimbursement = getKelaReimbursement(length);
		// Call the function (2.) which calculates amount left for the customer to pay
		let toPay = payableFee(doctorsFee, kelaReimbursement) + officeFee;
		// Write the answer on the page, to the answer div, as content of the div
		let text = "Doctor's Fee is " + doctorsFee.toFixed(2) + " euros.<br>Kela reimbursement is " + kelaReimbursement.toFixed(2) + " euros.<br>Office Fee is " + officeFee.toFixed(2) + " euros.<br>Customer needs to pay " + toPay.toFixed(2) + " euros."
		document.getElementById("answer").innerHTML = text;
}
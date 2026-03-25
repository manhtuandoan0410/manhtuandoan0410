/*() Define a function (1.) which gets the length of the doctor's visit as a parameter and returns the maximum Kela reimbursement.

One of the cottage retreat participants is hurt and needs to visit a private doctor. Kela pays back some part of the private medical treatment, e.g. of the doctor’s fee.

The maximum Kela reimbursement (Kela-korvaus) is decided based on the following table:
Doctor’s visit, no more than 10 min, 8.00 euros
Doctor’s visit, no more than 20 min, 11.00 euros
Doctor’s visit, no more than 30 min, 13.50 euros
Doctor’s visit, no more than 45 min, 16.50 euros
Doctor’s visit, more than 45 min, 21.00 euros
Make a function (1.), which gets the length of the visit as a parameter and returns the maximum Kela reimbursement. Convert the length to a number value with the parseInt() function before calculation.
Make a function (3.) that is called when the button is clicked. It naturally uses the function (1.). Use descriptive and long enough function and variable names.
Sample output for shown input:
	Doc visit and kela
	length: 21 min
	Doc's fee: 36 euros
	--> lengtth of visit is 21 minutes.
	--> kela reimbursement is 13.50 euros.
*/
// Define a function  

function getKelaReimbursement(lengthOfVisit) {

	lengthOfVisit = parseInt(lengthOfVisit); 

	if (lengthOfVisit <= 10) {
			return 8.00;
		} else if (length <= 20) {
			return 11.00;
		} else if (length <= 30) {
			return 13.50;
		} else if (length <= 45) {
			return 16.50;
		} else { return 21.00}

}

function calculate() {
    // Read values from the input fields
    let length = Number(document.getElementById("length").value);
    let doctorsFee = Number(document.getElementById("doctorsFee").value);

    // Call the function which calculates and returns Kela reimbursement 
    let kelaReimbursement = getKelaReimbursement(length);

    // Calculate patient's out-of-pocket cost
    let patientPays = doctorsFee - kelaReimbursement;
    if (patientPays < 0) patientPays = 0; // safeguard in case reimbursement > fee

    // Build output text
    let text = "Length of visit is " + length + " minutes.<br>" +
               "Doctor's fee is " + doctorsFee.toFixed(2) + " euros.<br>" +
               "Kela reimbursement is " + kelaReimbursement.toFixed(2) + " euros.<br>" +
               "Patient pays " + patientPays.toFixed(2) + " euros.";

    // Write the answer on the page
    document.getElementById("answer").innerHTML = text;
}
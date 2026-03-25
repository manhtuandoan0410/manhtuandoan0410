
var bloodTypes = ["A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O-", "AB+"];

function searchBloodType() {
        
    let txtBloodType = document.getElementById("txtBloodType").value;
    let txt = txtBloodType.toUpperCase();
    let result = "";
    
    //count the match between input & array
    let matches = 0;  
    for (let i = 0; i < bloodTypes.length; i++) {
        if (bloodTypes[i] == txt) {
            matches++;
        }         
    }

    //in case user doen't give a valid value 
    if (matches === 0) {
        document.getElementById("pOutput").textContent = "Please input a valid BLOOD TYPE (A+, O-, AB+, O+)";
        return;
    }
    
    //calculate the percentage of the input blood type in the array
    let percentage = (matches / bloodTypes.length) * 100;
    result = txt + " " + percentage.toFixed(0) + " percent";
    
    document.getElementById("pOutput").innerHTML = result;

}
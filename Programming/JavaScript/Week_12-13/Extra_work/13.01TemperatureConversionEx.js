function convert() {
    //forluas for conversion
    //C = (F-32) *5/9
    //F = (C*1.8)+32

    const tempInput = document.getElementById("temperature").value;
    const temperature = parseFloat(tempInput);

    if (isNaN(temperature)) {
        document.getElementById("result").value = "Please enter a valid number.";

        return;
    }

    const conversionType = document.getElementById("conversion").value;
    
    let result;

    if (conversionType === "celsius") {
        result = (temperature - 32) * 5/9;
        document.getElementById("result").value = result.toFixed(2) + " C";
    } else if (conversionType === "fahrenheit") {
        result = (temperature * 1.8) + 32;
        document.getElementById("result").value = result.toFixed(2) + " F";
    } else { document.getElementById("result").value = "Error: Unknown conversion type."}
    

}
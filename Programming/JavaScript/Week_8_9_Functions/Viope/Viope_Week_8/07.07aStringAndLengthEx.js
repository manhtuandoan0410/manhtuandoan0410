function processName() {

    // read value of name from the input field
    let name = document.getElementById("name").value;

    // show it with "ALL CAPS" using toUpperCase()
    document.getElementById("upperCase").innerHTML = "With upper case letters: " + name.toUpperCase();

    // show it with  "all small letters" using toLowerCase()
    document.getElementById("lowerCase").innerHTML = "With lower case letters: " + name.toLowerCase();

    //tell how many characters are there (length, includes also all spaces) 
    document.getElementById("length").innerHTML = "Character count: " + name.length;
}
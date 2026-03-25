// Create an array of twelve average temperatures
let temperatures = [-3.3, -4.7, -1.3, 3.9, 10.2, 14.6, 17.8,
				16.3, 11.5, 6.6, 1.6, -2.0];

function loopTemperatures() {
    // For loop
    let counter = 1;

    for (let temp of temperatures) {
        console.log(counter + "." + temp.toFixed(1));
        counter++;
    }
        // Use the console.log() method to write each temperature of the array

}


function randomizeAphorism() {
    let aphorismArray = ["A great flame follows a little spark", 
                        "The act of dying is one of the acts of life", 
                        "Don't stop believing", 
                        "Bohemian RHapsody",
                        "The sound of silence",
                        "Kiss from a rose",
                        "Thunderstruck",
                        "I was made for loving you",
                        "Life isn't about finding yourself. Life is about creating yourself", 
                        "We do not remember days, we remember moments",
                        "Beware the barrenness of a busy life"];
    let aphorismNumber = Math.floor(Math.random() * aphorismArray.length);

    return aphorismArray[aphorismNumber];

}
    
function getAphorism() {

    let aphorism = randomizeAphorism();
    document.write(aphorism); // document.write to show on the page, not console.log, in case of not using id.
}

getAphorism();

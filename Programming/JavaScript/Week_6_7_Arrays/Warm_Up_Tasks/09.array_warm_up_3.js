// 09.array_warm_up_3.js JavasScript code
// Study the code below and change it so that the program shows 
// a hand of 5 cards where cards can be from all four suits.

function randomizeCard() {
    var suitArray = ["c", "d", "h", "s"]; //c for club, d for diamond, h for heart, s for spade
    var suitNumber = Math.floor(Math.random() * 4); // change from *2 to *4 to generate cards from 4 suits
    var cardNumber = Math.floor(Math.random() * 13) + 1; // generate 13 cards from a suit, starting from 1
    var imageFileName = "cardImages/" + suitArray[suitNumber] + cardNumber + ".gif"; // create image of cards that matches with cards randomized
    
    return imageFileName;
}

function checkForDuplicate (hand, imageFileName) {
    // for (var i = 0; i < hand.length; i++ ){
    //     if (hand[i] === imageFileName) {
    //         return true;
    //     }
    // }
    
    // modify the function to a while-loop

    var i = 0;
    while (i< hand.length) {
        i++

        if (hand[i] === imageFileName) {
            return true;
        }
    }

    return false;
}


function newHand() {
    var hand = ["", "", "", "", ""]; // put one more "" in the array to increase number of card
    // var cardCount = 0;
    
    // while (cardCount < hand.length) {
    //     var imageFileName = randomizeCard();
    //     var isDuplicate = checkForDuplicate(hand, imageFileName);
        
    //     if (isDuplicate == false) {        
    //         hand[cardCount] = imageFileName;
    //         cardCount++;
    //     }
    // }

    //change the loop to for-loop
    for (let cardCount = 0; cardCount < hand.length; cardCount++) {
        let imageFileName = randomizeCard()
        let isDuplicate = checkForDuplicate(hand, imageFileName);

        if (isDuplicate == false) {
            hand[cardCount] = imageFileName;
            
        }
    }


    for (var i = 0; i < hand.length; i++) {
        document.write('<img src="' + hand[i] + '" alt="card image" /> ');     
    }
}

newHand(); // call a function

// End
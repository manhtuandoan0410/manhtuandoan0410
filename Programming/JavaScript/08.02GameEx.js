function calculateProfit() {
    // Read value of rounds from the input field
    let rounds = Number(document.getElementById("rounds").value);
    var bet = 1;
    var result = "";

    for (let i = 1; i <= rounds; i++) {
        let pips = Math.round( (Math.random( ) * 5) + 1 );

        if (pips === 6) {
            let win = 150 * bet * i / 100;
        } else if (pips === 2 || pips === 4) {
            let win = 125 * bet * i / 100;
        } else { }


    }
    

   
    // Make a loop which is executed as many times as was set through the input field. 
    // Let win counter cumulating during every round of the loop. 
    
        // Randomize pips between 1-6 calling Math.round( (Math.random( ) * 5) + 1 );
     

        // If the randomized pips is 1, 3 or 5,  no pay
        
         // Otherwise if the pips 2 and 4 return the set coins back 125% (=multiplied by 1.25)
       

        // Otherwise the pips 6 returns the inserted bet 150%	
        
    

    //Calculate the profit (euros) of the company by subtracting the win counter (euros) from the bets (euros)
   

    // Write the answer on the page, to the answer div, as content of the div
   

}
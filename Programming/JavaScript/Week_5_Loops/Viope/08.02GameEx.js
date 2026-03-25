function calculateProfit() {
    // Read value of rounds from the input field
    const rounds = Number(document.getElementById("rounds").value);
    const bet = 1;
    let totalWins = 0;
    
    // Make a loop which is executed as many times as was set through the input field. 
    for (let i = 1; i <= rounds; i++) {
    // Let win counter cumulating during every round of the loop. 
    
        // Randomize pips between 1-6 calling Math.round( (Math.random( ) * 5) + 1 );
        let pips = Math.round((Math.random() * 5) + 1);
        let earningRate;
        // If the randomized pips is 1, 3 or 5,  no pay
        if (pips === 1 || pips === 3 || pips === 5) {
            earningRate = 0;
        } else if (pips === 2 || pips === 4) { // Otherwise if the pips 2 and 4 return the set coins back 125% (=multiplied by 1.25)
            earningRate = 1.25;
        } else { // Otherwise the pips 6 returns the inserted bet 150%
            earningRate = 1.5;
        }
        
        totalWins += bet * earningRate;

    }

    const totalBets = rounds * bet;
    const companyProfit = totalBets - totalWins;        
    //Calculate the profit (euros) of the company by subtracting the win counter (euros) from the bets (euros)
    
    const results = "Bets were altogether " + rounds.toFixed(2) + " euros<br>Wins were " + totalWins.toFixed(2) + "euros<br>Profit was " + companyProfit.toFixed(2) + "euros";
    document.getElementById("answer").innerHTML = results;
    // Write the answer on the page, to the answer div, as content of the div
   
}
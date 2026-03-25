#Create a program called functions_third. The program should have a function called compute_discount 
# that takes price in euros and discount percentage as arguments. 
# The function should compute and return the amount of discount in euros.

#The main function should first input price in euros and discount percentage from the user and then 
# call the compute_discount function with the inputted values. 
# Finally, the main function should print the discount in euros.

#NB! The compute_discount function should not print anything.

#Example output:
#Enter price: 1500.00
#Enter discount percentage: 22.5
#The discount is 337.50 euros

def compute_discount(price, rate):
    discount = float (price * rate) / 100
    print(f"The discount is {discount:.2f} euros")
    return

def main():
    price = float(input("Enter price: "))
    rate = float(input("Enter discount percentage: "))
    compute_discount(price, rate)

main()
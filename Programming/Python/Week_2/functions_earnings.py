#Create a program called functions_earnings. The program should have a function called compute_earnings that 
# takes hourly wage and hours worked as arguments. The function should compute and return the earnings.

#The overtime pay is time-and-a-half after 40 work hours.

#The main function should first input hourly wage and hours (integer) from the user and then 
# call the compute_earnings function with the inputted values. Finally, the main function should print 
# the earnings with two decimal places.

#B! The compute_earnings function should not print anything.

#Example output:
#Enter wage: 24.25
#Enter hours: 50
#The earnings are 1333.75

def compute_earnings(wage: float, hours: int):
    if hours <= 40:
        earning = float (wage * hours)

        print(f"The earnings are {earning:.2f}")
    else:
        earning = float((wage * 40) + (wage * 1.5 * (hours-40)))
        print(f"The earnings are {earning:.2f}")
    return 

def main():
    wage = float(input("Enter wage: "))
    hours = int(input("Enter hours: "))
    compute_earnings(wage, hours)

main()
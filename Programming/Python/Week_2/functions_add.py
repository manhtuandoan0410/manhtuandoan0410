#Create a program called functions_add. The program should have a function called add that takes two floats as arguments. 
# The function should return the sum of the floats as an integer. When rounding is needed, then half should be rounded up. 
# (One trick is to add 0.5 before type conversion)

#The main function should first input two floats from the user and then call the add function with the inputted values. 
# Finally, the main function should print the integer, which the add function returns.

#NB! The add function should not print anything.

#Example output:
#Enter a float: 2.2
#Enter a float: 3.3
#6

def add(num1: float, num2: float):
    sum = num1 + num2
    if sum % 2 == 0:
        return int(sum)
    else:
        sum += 0.5
        return int(sum)

def main():
    num1 = float(input("Enter a float: "))
    num2 = float(input("Enter a float: "))
    add(num1, num2)

main()
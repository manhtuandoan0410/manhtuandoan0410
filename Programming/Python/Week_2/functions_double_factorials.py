#Create a program called functions_double_factorials. The program should have a function called double_factorial that 
# takes an integer as argument and returns the double factorial of the integer. 
# See the previous "Double Factorial" exercise for more details. The double_factorial function should not print anything.

#The main function should print double factorials of 0 – 9 as shown in the example output. 
# To determine the double factorial of each number, the main function should call the double_factorial function. 
# Please use the for loop in the main function.

#Example output:
#0!! = 1
#1!! = 1
#2!! = 2
#3!! = 3
#4!! = 8
#5!! = 15
#6!! = 48
#7!! = 105
#8!! = 384
#9!! = 945


def double_factorial(n: int):
    number = 1
    for i in range (n, 0, -2):
        number *= i
    return number 

def main():
    for i in range(10):
        print (f"{i}!! = {double_factorial(10)}")

main()

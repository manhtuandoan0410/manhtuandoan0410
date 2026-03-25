#Create a program called functions_pyramid. The program should have a function called print_pyramid that 
# takes the height of the pyramid as argument. The function should print a pyramid using the character "*" 
# as shown in the example output.

#The main function should first input the height of the pyramid and then call the print_pyramid function 
# with the inputted values.

#Hint: print(5 * "X") prints XXXXX

#If we take advantage of this operation, the whole loop that prints the pyramid can be written on two lines of code.

#Example output:
#Enter pyramid height: 4
#   *
#  ***
# *****
#*******

def print_pyramid(height):
    #for i in range(1, height + 1):
    #    spaces = height - i
    #    stars = 2 * i - 1
    #    print(" " * spaces + "*" * stars)

    for stars in range(1, height * 2, 2):
        row = (stars + 1) // 2
        spaces = height - row
        print(" " * spaces + "*" * stars)

def main():
    height = int(input("Enter pyramid height: "))
    print_pyramid(height)

main()
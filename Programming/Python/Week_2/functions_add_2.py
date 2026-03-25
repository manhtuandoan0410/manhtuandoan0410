#Copy/paste all the code from your functions_add program to the new program. Then modify the new program as follows:

#if __name__ == "__main__":
#    main()
#In addition to running the functions_add_2 program normally, 
# we can now do some unit testing where the test module calls your add function without running your program.

#Please copy/paste your code to Viope.

#This time, when you click on the Run button, Viope runs the test module and V
# iope shows the unit test report (instead of your program's normal output) in the test execution console. 
# Therefore, we do not have the example output in this exercise description.

#NB! The test module (not your program) prints the output you see below.

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
if __name__ == "__main__":
    main()
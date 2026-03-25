try:    
    x = int(input("Enter an integer: ")) 
    print(f"The cube of {x} is {x ** 3}") 
except ValueError: 
    print("The entered value is not an integer") 
print("Bye!") 
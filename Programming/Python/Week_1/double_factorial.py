userInput = input("Enter a non-negative integer: ")

try:
    num = int(userInput)
    if num < 0:
        print("Please enter a non-negative integer")
    else:
        result = 1
        for i in range(num, 0, -2):
            result *= i
        print(f"{num}!! = {result}")
except ValueError:
    print("Please enter a non-negative integer")
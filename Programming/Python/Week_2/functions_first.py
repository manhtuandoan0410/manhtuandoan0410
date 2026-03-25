#Create a program called functions_first. The program should have a function called print_powers that prints the first 20 
# powers of two to the console. Call the print_powers function from the main function.

#Please use a for loop in your program.

#Example output:
#1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536 131072 262144 524288 

def print_powers():
    for i in range(20):
        print(2 ** i, end=" ")

def main():
    print_powers()

main()
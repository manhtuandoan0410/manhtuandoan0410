interestRate = float(input("Enter interest rate: "))
capitalIncomeTax = float(input("Enter capital income tax rate: "))
initialDeposit = float(input("Enter initial deposit: "))
years = int(input("Enter number of years: "))

balance = initialDeposit

for year in range(1, years + 1):
    interest = balance * (interestRate / 100)
    interest_after_tax = interest * (1 - capitalIncomeTax / 100)
    balance += interest_after_tax
    print(f"Year {year}: {balance:.2f}")

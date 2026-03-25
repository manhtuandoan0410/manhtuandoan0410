from datetime import date
from calendar import monthrange

def print_month_calendar(year, month):
    month_names = ["", "January", "February", "March", "April", "May", "June",
                   "July", "August", "September", "October", "November", "December"]

    # keep this if Viope wants a blank line before the header
    print()
    
    # keep your exact formatting here as Viope requires
    print(f" > {month_names[month]} {year} <")
    print(" Mon Tue Wed Thu Fri Sat Sun")

    first_day = date(year, month, 1)
    first_weekday = first_day.weekday() + 1      # 1 = Mon ... 7 = Sun
    days_in_month = monthrange(year, month)[1]

    # if Viope wants no leading spaces before 1, remove this line
    print(" " * 4 * (first_weekday - 1), end="")

    # FIXED LOOP
    for day in range(1, days_in_month + 1):
        print(f"{day:4d}", end="")

        # newline after SUNDAY (use day, not days_in_month)
        if (first_weekday - 1 + day) % 7 == 0:
            print()

    # FINAL NEWLINE ONLY IF LAST DAY WAS NOT SUNDAY
    if (first_weekday - 1 + days_in_month) % 7 != 0:
        print()


def main():
    year = int(input("Enter year: "))
    month = int(input("Enter month: "))
    print_month_calendar(year, month)


if __name__ == "__main__":
    main()

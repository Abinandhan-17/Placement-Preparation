def check_even_odd(num):
    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"

# Input
number = int(input("Enter a number: "))

# Function Call
result = check_even_odd(number)

# Output
print(number, "is", result)
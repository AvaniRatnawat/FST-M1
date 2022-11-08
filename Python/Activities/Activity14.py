# Recursive Function to generate Fibonacci Series

def fibonacci_series(number):
    if number <=1:
        return number
    else:
        return(fibonacci_series(number-1) + fibonacci_series(number-2))


num = int(input("Enter a number: "))

if num <= 0:
    print("Please enter a positive number!")
else:
    print("Fibonacci Series: ")
    for i in range(num):
        print(fibonacci_series(i))
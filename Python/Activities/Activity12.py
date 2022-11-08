#Recursive Function to calculate sum

def calculateSum(number):
    if number:
        return number + calculateSum(number-1)
    else:
        return 0

# Call calculateSum()
result = calculateSum(10)

#Print result
print(result)

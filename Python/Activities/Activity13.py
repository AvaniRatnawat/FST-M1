# Function to accept list of elements and print the sum of elements

def calculate_lis_sum(num_list):
    sum = 0
    for number in num_list:
        sum += number
    return sum


# List of numbers
numList= [10, 12, 14, 180, 2]

# Call the function and print sum
result = calculate_lis_sum(numList)
print("Sum of all the numbers in the list : "+str(result))

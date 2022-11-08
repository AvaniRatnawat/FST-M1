# Sum of all the elements in a list
numbers = list(input("Enter a list of numbers separated by comma: ").split(","))
sum = 0

for num in numbers:
    sum += int(num)

print(sum)
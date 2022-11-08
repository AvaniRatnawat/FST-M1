#Check if first and last number is same
numList = list(input("Enter a list of numbers separated by comma: ").split(","))
print("Given list is", numList)

firstElement = numList[0]
lastElement = numList[-1]

if(firstElement == lastElement):
    print("First and last elments are same")
else:
    print("First and last elements are not same")

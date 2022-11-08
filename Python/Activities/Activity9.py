#2 Lists
listOne = [10,23,34,41,51,60]
listTwo = [20,32,33,45,66,77,88,33]

print("First List: ", listOne)
print("Second List: ", listTwo)

thirdList = []

for num in listOne:
    if(num%2 !=0):
        thirdList.append(num)

for num in listTwo:
    if(num%2 == 0):
        thirdList.append(num)

print("Final List is: ", thirdList)

numb_tuple = (10, 12, 13, 15, 26, 25)
print("Given tuple is: ", numb_tuple)

print("Elements which are divisible by 5: ")
for num in numb_tuple:
    if(num % 5 == 0):
        print(num)

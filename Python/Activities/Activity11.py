#Fruit shop

fruit_shop = {
    "orange": 100,
    "apple": 200,
    "peach": 150,
    "melon": 80
}

fruit_toCheck = input("Which fruit you want ? ").lower()

if(fruit_toCheck in fruit_shop):
    print("Required fruit is available")

else:
    print("Required fruit is not available")
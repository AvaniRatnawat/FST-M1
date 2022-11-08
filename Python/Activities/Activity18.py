import pandas

# Read the csv file and store in dataframe
dataframe = pandas.read_csv("resources\sample.csv")

# print full data
print("Full Data : ")
print(dataframe)

# Print the values only in the Usernames column
print("==================================")
print("Values in Usernames column : ")
print(dataframe["Usernames"])

# Print username and password of the second row
print("==================================")
print("Username and password of the second row : ")
print("Username : ", dataframe["Usernames"][1], "|", "Password : ", dataframe["Passwords"][1])

# Sort the Usernames column data in ascending order and print data
print("==================================")
print("Sorted Usernames in ascending order : ")
print(dataframe.sort_values("Usernames"))

# Sort the Passwords column in descending order and print data
print("==================================")
print("Sorted Password in descending order : ")
print(dataframe.sort_values("Passwords", ascending=False))


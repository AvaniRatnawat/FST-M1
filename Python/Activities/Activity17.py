import pandas

# Create dictionary to store data
data = {
    "Usernames": ["admin", "root", "Sally"],
    "Passwords": ["password", "buzzer", "t@QQQ"]
}

# Create a dataframe from dictionary
dataframe = pandas.DataFrame(data)

# Print dataframe
print(dataframe)

dataframe.to_csv("resources\sample.csv", index=False)

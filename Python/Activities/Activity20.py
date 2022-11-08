# Read data from Excel file

import pandas

dataframe = pandas.read_excel("resources\data.xlsx")
print(dataframe)

# Print the number of rows and columns
print("========================================================")
print("Number of rows and columns in excel: ", dataframe.shape)

# Print data in email column only
print("========================================================")
print("Emails:")
print(dataframe['Email'])

# Sort the data based on FirstName in ascending order and print the data
print("========================================================")
print("Sorted Data:")
print(dataframe.sort_values('FirstName'))


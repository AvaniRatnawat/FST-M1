# Create excel file using pandas

import pandas
from pandas import ExcelWriter

# Create dictionary that will be used to create dataframe
data = {
    'FirstName':["Peter", "Sana", "John"],
    'LastName':["Jobs", "Perry", "Green"],
    'Email':["peterjobs@example.com", "sanaP@example.com", "john.green@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create dataframe
dataframe = pandas.DataFrame(data)
print(dataframe)

# Write to excel file
writer = ExcelWriter("resources\data.xlsx")
dataframe.to_excel(writer, 'Sheet1', index=False)
writer.save()
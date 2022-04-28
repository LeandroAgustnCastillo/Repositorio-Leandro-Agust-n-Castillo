import requests

url = 'https://openlibrary.org/works/OL45883W.json'
  
import os

r = requests.get(url)
data = r.text
print(data)

//Header

import os

URL ='https://openlibrary.org/works/OL45883W.json'
data = request.get (URL)
data = data.txt

with open ('archive.txt', "w") as f
f.write(data)

file = open("archive.txt", "w")
file.write("Primera línea" + os.linesep)
file.write("Segunda línea")
file.close()

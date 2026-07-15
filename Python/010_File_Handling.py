file = open("sample.txt", "w")
file.write("Hello, Python!")
file.close()

file = open("sample.txt", "r")
print(file.read())
file.close()
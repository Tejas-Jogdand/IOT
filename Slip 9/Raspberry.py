name = input("Enter your name: ")
print(f"Hello {name}")

# a) Calculate area
shape = input("Enter shape (rectangle, triangle, circle): ")
if shape == "rectangle":
    length = float(input("Enter length: "))
    width = float(input("Enter width: "))
    print("Area:", length * width)

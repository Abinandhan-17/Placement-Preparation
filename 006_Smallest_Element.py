arr=[12,45,8,67,30]
smallest=arr[0]
for i in range(1, len(arr)):
    if arr[i] < smallest:
        smallest = arr[i]
print("The smallest element is:", smallest)
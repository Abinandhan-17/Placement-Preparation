arr=[12,45,8,67,30]
 
largest=arr[0]
for i in range(1, len(arr)):
    if arr[i] > largest:
        largest = arr[i]
print("The largest element is:", largest)
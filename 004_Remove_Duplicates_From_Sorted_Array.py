# Remove Duplicates from Sorted Array

nums = [1, 1, 2, 2, 3, 4, 4]

unique = []

for num in nums:
    if num not in unique:
        unique.append(num)

print("Unique Elements:", unique)
print("Count:", len(unique))
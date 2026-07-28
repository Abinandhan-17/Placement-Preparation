SELECT Name,
COALESCE(PhoneNumber, 'Not Available') AS Contact
FROM Customers;
import bcrypt

password = "Masai@000"

# Generate bcrypt hash with a cost factor of 10
hashed_password = bcrypt.hashpw(password.encode('utf-8'), bcrypt.gensalt(10))

print("Generated bcrypt hash:", hashed_password.decode('utf-8'))

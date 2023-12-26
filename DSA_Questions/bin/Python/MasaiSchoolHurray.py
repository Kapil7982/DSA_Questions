def print_pattern(N):
    for num in range(1, N + 1):
        if num % 7 == 0 and num % 5 == 0:
            print("Masai School")
        elif num % 7 == 0:
            print("Masai")
        elif num % 5 == 0:
            print("School")
        else:
            print("Hurray!")


N = int(7)
print_pattern(N)

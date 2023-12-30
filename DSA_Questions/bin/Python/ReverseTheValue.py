n = int(791)

count = 0

while n != 0:
    l = n % 10
    count = count * 10 + l
    n = n // 10

print(count)

def identifyPrime(num):
    flag = 0
    for i in range(2, num):
        if num % i == 0:
            flag += 1
            break
    if flag == 0:
        print("Yes")
    else:
        print("No")


identifyPrime(7)
identifyPrime(12)

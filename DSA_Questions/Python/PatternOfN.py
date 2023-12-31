n = int(4)


def patterOfN(N):
    count = 1
    for i in range(0, N):
        sum = ""
        for j in range(0, N):
            sum += str(count) + " "
            count += 1
        print(sum)


patterOfN(n)

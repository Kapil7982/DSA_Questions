n = 4
array = [2, 5, 0, 9, 4]


def averageOfAll(N, arr):
    sum = 0
    for i in range(0, N):
        sum += arr[i]
    average = sum / N
    print(average)


averageOfAll(n, array)

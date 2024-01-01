N = int(5)
array = [1, 2, 3, 8, 4, 5]


def maximumInArray(n, arr):
    max = arr[0]
    for i in range(1, n):
        if arr[i] > max:
            max = arr[i]

    print(max)


maximumInArray(N, array)

n = 5
array = [1, 2, 3, 4, 5]


def evenInArray(N, arr):
    for i in range(0, N):
        if arr[i] % 2 == 0:
            print(arr[i])


evenInArray(n, array)

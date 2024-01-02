n = 5
array = [-1, -5, 1, 2, 3, 4, 5]


def minimumInArray(N, arr):
    min_value = float("inf")
    for i in range(0, N):
        if arr[i] < min_value:
            min_value = arr[i]
    print(min_value)


minimumInArray(n, array)

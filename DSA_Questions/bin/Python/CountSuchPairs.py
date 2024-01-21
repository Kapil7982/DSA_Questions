n = 5
k = 9
array = [3, 0, 6, 2, 7]


def countSuchPairs(N, K, arr):
    count = 0
    for i in range(0, N):
        for j in range(i + 1, N):
            if arr[i] + arr[j] == K:
                count += 1
    print(count)


countSuchPairs(n, k, array)

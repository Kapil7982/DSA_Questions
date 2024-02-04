n = 6
input = "level"


def checkPalindrome(N, string):
    bag = string[::-1]

    if string == bag:
        print("Yes")
    else:
        print("No")


checkPalindrome(n, input)

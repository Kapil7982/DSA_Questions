n = 4
strin = "duadhv"


def checkVowel(N, string):
    bag = 0
    for i in range(0, N):
        if (
            string[i] == "a"
            or string[i] == "e"
            or string[i] == "i"
            or string[i] == "o"
            or string[i] == "u"
        ):
            bag = 1
            break
    if bag == 1:
        print("true")
    else:
        print("false")


checkVowel(n, strin)

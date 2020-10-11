def find_nth_occurrence(word, my_str, n):
    count = 0
    for i in range(0,(len(my_str)-len(word)-1)):
        li = my_str[i:(i+len(word))]
        # print(li)
        if li == word:
            count += 1

        if count == n:
            return i
    else:
        return -1   

my_str = input("Enter a string: ")
word = input("Enter the word you want to find for: ")
n = int(input("Enter the occurence for which you want to find the word: "))
print(find_nth_occurrence(word, my_str, n))

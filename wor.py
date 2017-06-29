def isPalindrome(word):
    i = 0
    j = len(word) - 1
    while i < j:
        if word[i] != word[j]:
            return False
        i+=1
        j-=1
    return True
    
    
def longestPalindrome(string):
    length = len(string)
    maxLength = len(string)
    while maxLength > 1:
        start = 0
        while start <= length - maxLength:
            end = start + maxLength
            if isPalindrome(string[start:end]):
                return string[start:end]
            start += 1
        maxLength -= 1
    return False

def lengthof(s:str)->int:
    s=s.strip()
    word=s.split(' ')
    return len(word[-1])

print(lengthof("Hello World"))
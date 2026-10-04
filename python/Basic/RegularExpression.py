import re
pat=re.compile(r'a*')
str1='Kursi ki peti bandh lo , mausam bigaadne walaaa hai'
res=pat.finditer(str1)
for i in res:
    print(i)
    print(i)
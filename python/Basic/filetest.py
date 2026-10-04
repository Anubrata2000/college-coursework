
f=open('input.txt')
s=f.readline()
s=s.split()
s=[int(i) for i in s]
sum=0
for i in s:
    sum+=i
f.close()
f=open('output.txt','w')
f.write(str(sum))
f.close()

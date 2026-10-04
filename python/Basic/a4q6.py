def up(a):
	return chr(a-32)
s=input()
c=0
s1=""
for i in s:
	q=ord(i)
	if((q>=65 and q<=90) or (q>=97 and q<=122)):
		c+=1
print(c)
hc=hcd=(int)(c/2)
print(hc)
print(s1)
for i in s:
	q=ord(i)
	if(hcd>0):
	
		if(q>=65 and q<=90):
			c+=1
			s1=s1+i
		elif(q>=97 and q<=122):
			c+=1
			s1=s1+up(q)
		else:
			s1=s1+i		
		hcd-=1
	else:
		s1=s1+i
		continue

print(s1)
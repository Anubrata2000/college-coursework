sum = 0
fact = 1
for i in range(1,8):
    fact = fact*i
    t = i/fact
    sum = sum+t
print(sum)

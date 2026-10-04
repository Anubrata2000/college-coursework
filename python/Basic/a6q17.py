def unique_list(l):
  x = list()
  for a in l:
    if a not in x:
      x.append(a)
  return x

l=input("Enter a list divided by space: ").split()
print(unique_list(l)) 

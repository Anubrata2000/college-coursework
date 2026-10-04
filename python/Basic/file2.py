def fetch(l,ind):
    s=l[ind]
    return s
try:
    f=open('input1.txt')
    str1=f.readline()
    lst=str1.split()   
    res=10/0
    print(fetch(lst,3))
except (IndexError,ZeroDivisionError):    
    print("Index Error or Zero division error")
except FileNotFoundError:
    print("File not found")
except :
    print("Default Exception Handler")    
finally:
    print("/nEnd")
    f.close()
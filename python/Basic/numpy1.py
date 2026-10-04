import numpy as np
import pandas as pd
import matplotlib.pyplot as plot
ar1=np.array([1,2,3,4])
print(ar1)
ar2=ar1.reshape((2,2))
print(ar2)
ar3=np.zeros((2,3))
ar4=np.ones((2,3))
df1=pd.read_csv('D:/Python/Book1.csv')
print(df1)
plot.scatter(df1['Hr_study'],df1['Performance'])
plot.title('Study vs Performance')
plot.xlabel('Hour of study')
plot.ylabel('Performance')
plot.show()
plot.hist(df1['Marks'])
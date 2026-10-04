import numpy as np
import matplotlib.pyplot as plot
time = np.arange(0, 10, 0.1);
amplitude   = np.sin(time)
plot.plot(time, amplitude)
from bsearch import bsearch
import time
from pylab import *


def timedBsearchRun(lst, num):
  start = time.clock()
  bsearch(lst, num)
  # num in lst
  end = time.clock()
  return end - start

def generateListAndRun(size):
  l = range(size)
  n = size-1
  return timedBsearchRun(l, n)


def setupAndPlot(x, y):
  xlabel('x axis')
  ylabel('y axis')
  title('testing plot')
  grid(True)
  plot(x, y)
  show()
  
# main code: 
sizes = []
times = []
for length in range(1000):
  t = generateListAndRun(length)
  sizes.append(length)
  times.append(t)
setupAndPlot(sizes, times)
TITLE: README.txt
Author: FVCproductions

**FVCproductions**  
**Homework 4 - Union Find**  
**CSC252 - Data Structures II**  
**March 2015**  

---

# QUESTIONS

1. **For your DisjointSets implementation, what is the worst case running time of a single union operation?**

The worst case running time is 0(1). The union operation combines each two sets every time it is called, regardless of how many sets there are.

2. **For your DisjointSets implementation, what is the worst case running time of a single find operation?**

The worst case running time is 0(1) since path compression has to be taken into account. If there wasn't path compression, it would be 0(log n). 
 
3. **Briefly discuss how you went about testing your disjoint sets. Feel free to refer to your submitted test files.**

I just used my debugger, CodeRunner, to test the project throughout. Several methods were called on the `MyDisjSets` object in order to catch exceptions and to make sure that the `union()` and `numSet()` methods were working well. 

4. **Discuss whether your implementation can build a 1000 x 1000 maze in a reasonable amount of time (and discuss what you consider reasonable).  If not, describe what part of your implementation you believe is taking too much time and why you think that is the problem.  If so, describe how a change to your code might slow down the creation of a maze of this size and why you expect such a change to matter.**

Yes, this 1000x1000 maze was built in no time on my MBA (Macbook Air). It took approximately 6 seconds and 141 milliseconds. But when I look at the result, it looks nothing like a maze since my screen is too small to handle the width and height of it. Oh, well.

I think that if I had used a single 2-D array instead of 2 boolean arrays, it would have probably taken a longer time since there would be more operation redundancy.

---

# **FILES THAT HAD TO BE CREATED/CHANGED & SUBMITTED**

- `MyDisjSets.java`
- `MazeBuilder.java`
- A file named `maze16x14.txt`  containing a maze of height 16 and width 14
- A file named `maze30x15.txt`  containing a maze of height 30 and width 15
- `README.txt` containing answers to the Homework Questions. 


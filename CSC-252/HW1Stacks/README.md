TITLE: README.txt
Author: FVCproductions

***FVCproductions  
Homework 1 - Stacks  
CSC252 - Data Structures II  
January 15, 2015***

# Questions

1. **How did you test that your stack implementations were correct?**
	
	- I just compiled it to see if there were any errors first and then used a very simple test driver to test each class separately. 
	- As for the the sound part, you can see the images provided to see how I went about the process `ReverseArgs`, `CompilerOutput`, and `ShellCommands`.

2. **The file secret.wav is a backwards recording of a word or short phrase.  Use sox (or another converter) and your program to reverse it, and write that as the answer to this question.**
	
	- See `reversed.wav`. The secret message is: “*The force will be you, always.*”.

3. **Your array stacks start with a small array and double in size if they become full.  For a .dat file with 1 million lines, how many times would this resizing occur?  What about with 1 billion lines or 1 trillion lines (assuming the computer had enough memory)? Explain your answer.**
	
	- With 1 million lines, it would be 17 times. With a billion lines, 27 times. 1 trillion lines, 37 times. The number of iterations necessary increases by 10 each time you increase the number of lines by a power factor.

4. **Suppose that, instead of a DStack interface, you were given a fully functional FIFO Queue class.  How might you implement this project (i.e., simulate a Stack) with one or more instances of a FIFO Queue? Download QueueStack.java and FIFOQueue.java and complete the push and pop operation in the QueueStack.java.  The FIFOQueue class provides the operations enqueue, dequeue, isEmpty, and size.  Turn in a file QueueStack.java.** 
	
	- Using the FIFOQueue class, I was able to implement the QueueStack.java file, which is included. See files.

5. **In the previous question, what trade-offs did you notice between a Queue implementation of a Stack and your original array-based implementation?  Which implementation would you choose, and why?** 
	
	- With the Queue implementation, the efficiency is higher with O(n) rather than with the original array-based one, which was O(1).  I would choose queue because there was more efficiency.

6. **Include a description of how your project goes "above and beyond" the basic requirements (if it does).**
	
	 - My project does not go ‘above and beyond’.

7. **What did you enjoy about this assignment?  What did you not enjoy?  What could you have done better?**
	
	- Eclipse is not the platform I usually use for programming (I use ST3/Code Runner), so I had to figure out how to pass command line arguments in the text editors/compilers I do use. I also don't feel the project was very Mac friendly, so that was not enjoyable, but I was able to find out how to properly use `sox` with Mac. 
	- I enjoyed the fact that there are realistic applications the project could have and how one could potentially dabble and mess around with it a bit. 
	- I probably could have gone 'above and beyond' in terms of making the project better for efficiency.

8. **What else, if anything, would you like to include related to this homework?**
	
	- Nothing else.

---

# **FILES THAT HAD TO BE CREATED/CHANGED & SUBMITTED**
	- QueueStack.java
	- ArrayStack.java
	- ListStack.java (with its inner Node class)
	- README.txt
	- reversed.dat
	- reversed.wav
	- secret.dat 

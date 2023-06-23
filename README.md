# StackAndHeapMemory

# 5 types of Memory:

1 - Stack Memory

2 - Heap Memory

3 - Method area 

4 - String constant pool

5 - Native method stacks


- All local variable data will be stored in Stack memory.

- Execution always starts from the main method.

Before the main method gets executed, JVM will create an empty stack memory for the location.



1 - The JVM will create the empty stack memory before calling the main method.

2 - All method, local variables, and intermediate calculations will be stored in stack memory when we call the method. Once the method is completed, the local variables and method calls are deleted from teh stack memory.

3 - After completion of the main method, the JVM will destory the empty Stack memory.


Object related data will be stored in Heap memory. Som instane variables will be stored into the Heap memory.

Static data will be stored in the method area.

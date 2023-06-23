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

4 - When JVM calls the main method, the method names and local variables are stored in the Stack memory.


Object related data will be stored in Heap memory. Som instane variables will be stored into the Heap memory.

Static data will be stored in the method area.


Keep on method calls will be stored in Stack memory.

You will get an error like "StackOverflowError".

Example:

class Test{

  void m2(){
  
    System.out.println("m2 method");
    
    m1();
    
  }

  void m1(){
  
    System.out.println("m1 method");
    
    m2();
    
  }
  
  public static void main(String[] args){
  
    Test t = new Test();
    
    t.m1();
    
  }
  
}

The example above is a good example of method recursion. Method recursion is when a method calls itself again and again.

In method recursion, it had base case scenario( factorial )  - going downards or upwards from a specific number.

Also it has infinite case scenario where method calls itself again and again and after sometime when the stack memory is full it will throw an error such as "StackOverflowError".


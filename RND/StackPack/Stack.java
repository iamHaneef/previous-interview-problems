package RND.StackPack;

 class Demo {

    int Stack_size=10;
    int[] store=new int[Stack_size];
    int top=-1;

    public void push(int val)
    {
        if(top > Stack_size)
        {
            System.out.println("Stack is Full");
        }
        else {
            top++;
            store[top]=val;
            System.out.println("The pushed element is : "+store[top]);

        }
    }

    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty");
        }
        else {
            int temp=store[top];
            top--;
            System.out.println("Popped Element is : "+temp);
        }
    }

    public void peek()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty");
        }
        else{
            int temp=store[top];
            System.out.println("The Peek Element Is : "+temp);
        }
    }
}
public class Stack{

    public static void main(String[] args)
    {
        Demo stack=new Demo();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.peek();
    }

}
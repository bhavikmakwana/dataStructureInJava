public class Stack {
    int[] stk;
    int top;

    public Stack(int size) {
        stk = new int[size];
        top = stk.length ;
    }

    public void push(int value) {
        if (top == 0) {
            System.err.println("Stack Overflow You can not push value ");
        } else {
            top--;
            stk[top] = value;
        }
    }

    public int pop() {
        if (top == stk.length) {
            System.err.println("Stack Underflow Stack is Empty you can not pop value");
            return 0;
        }else{
            int temp = stk[top];
            top++;
            return temp;
        }

    }

    public void display() {
        System.out.println("-----------Printing Stack-----------");
        for (int i = top; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    }

    public void search(int value) {
        for (int i = top; i < stk.length; i++) {
            if (value == stk[i]){
                System.out.println("Value found at : " + i);
            }
            else{
                System.err.println("Value not found !!");
            }
        }
    }
}

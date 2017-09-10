public class StackWithOtherBase {
    int [] stk = new int[3];
    int top = -1;

    public void push(int v){
        System.out.println(top);
        if (top == stk.length-1){
            System.err.println("Stack Overflow");
        }else {
            top ++;
            stk[top] = v;
        }


    }

    public void pop(){
        if (top == -1){
            System.err.println("Stack Underflow");
        }else{
            top--;
            int temp = stk[top];
            top--;

        }


    }

    public void display(){

        for (int i = top; i>=0 ;i--){
            System.out.println(stk[i]);
        }
    }

}

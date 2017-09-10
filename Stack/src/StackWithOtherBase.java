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
        top--;
        int temp = stk[top];

    }

    public void display(){

        for (int i = top; i>=0 ;i--){
            System.out.println(stk[i]);
        }
    }

}

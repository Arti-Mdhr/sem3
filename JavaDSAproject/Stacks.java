public class Stacks{
    public static void main(String[] args) {
        Stacks stk = new Stacks(5);
        stk.push(10);
        stk.push(20);
        System.out.println(stk.pop());
    }

    int stk[];
    int size;
    int top = -1;
    Stacks(int size){
        this.size = size;
        stk = new int[size];

    }    

    void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            // top++;
            stk[++top] = data;
        }
    }

    int pop(){
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -999;
        }
        return stk[top--];
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}
package Problem1;

import java.util.Stack;

public class ReverseStack {

    static Stack<Integer> stack = new Stack<>();

    public static void reverseStack(Stack<Integer> stack) {
        // homework
        if(stack.size() > 0){

            int x = stack.peek();
            stack.pop();
            reverseStack(stack);

            bottom_insert(x);
        }
    }


    static void bottom_insert(int x){

        if(stack.isEmpty()){
            stack.push(x);
        }

        else{
            int a = stack.peek();
            stack.pop();
            bottom_insert(x);

            stack.push(a);
        }
    }
}

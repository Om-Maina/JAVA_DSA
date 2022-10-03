package DSA.stacksAndQueues.stacks;

import DSA.stacksAndQueues.stacks.CustomStack;
import DSA.stacksAndQueues.stacks.DynamicStack;
import DSA.stacksAndQueues.stacks.StackException;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(85);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

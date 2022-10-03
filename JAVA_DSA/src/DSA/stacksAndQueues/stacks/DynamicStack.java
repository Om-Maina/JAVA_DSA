package DSA.stacksAndQueues.stacks;

import DSA.stacksAndQueues.stacks.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();//it will call customStack
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
//        return super.push(item);
        if (this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        //insert item
        //at this point we know array is not full
        return super.push(item);
    }
}

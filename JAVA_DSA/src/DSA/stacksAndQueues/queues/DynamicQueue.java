package DSA.stacksAndQueues.queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()){
            //double the array size
            int [] temp = new int[data.length * 2];
            // copy all previous item in the new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //at this point
        return super.insert(item);
    }
}

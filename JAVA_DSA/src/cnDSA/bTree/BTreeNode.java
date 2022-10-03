package cnDSA.bTree;

public class BTreeNode<T>{
    public BTreeNode(T data){
        this.data = data;
    }
    public T data;
    public BTreeNode<T> left;
    public BTreeNode<T> right;

}

public class Node {
    String data;
    Node next;
    public Node(String stroka){
        this.next = null;
        this.data = stroka;
    }
    public Node(String stroka, Node nextValue){
        this.next = nextValue;
        this.data = stroka;
    }
    public Object getData() { return data; }
    public void setData(String stroka) {
        this.data = stroka;
    }
    public Node getNext() { return this.next; }
    public void setNext(Node nextValue) { this.next = nextValue; }
    @Override
    public String toString() {
        String output ="";
        output = "node data="+this.data;
        return output;
    }
}

public class MyLinkedList {
    private final Node head;
    private int listCount;
    public MyLinkedList() {
        this.head = new Node(null);
        listCount = 0;
    }
    public void add(String data){
        Node tmp = new Node(data);
        Node current = this.head;
        while (current.getNext() != null){
            if (current.getNext().data.compareTo(tmp.data)<0){
                break;
            }
            current = current.getNext();
        }

        tmp.setNext(current.getNext());
        current.setNext(tmp);
        listCount++;
    }
    public void add(String data, int index){
        Node tmp = new Node(data);
        Node current = head;
        for (int i=1; i<index && current.getNext() != null; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        listCount++;
    }
    public Object get(int index){
        if (index <= 0 && Math.abs(index) >= listCount) return null;
        Node current = head.getNext();
        if (index < 0){
            for (int i = 1; i < listCount + index + 1; i++){
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        else {
            for (int i = 1; i < index + 1; i++) {
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        return current.getData();
    }
    public boolean remove(int index){
        if (index < 1 && index > size()) return false;
        Node current = head;
        for (int i =1; i < index; i++){
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
    return true;
    }
    public int size(){ return listCount; }
    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null){
            output += "[" + current.getData().toString() + "]";
            current = current.getNext(); }
        return output;
    }
}

public class ListEntry {

    private int value;
    private ListEntry next;

    public ListEntry(int value, ListEntry next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }

    public ListEntry getNext(){
        return next;
    }

    public void setNext(ListEntry newNext){
        this.next = newNext;
    }
    
}

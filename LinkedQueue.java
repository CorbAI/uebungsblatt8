public class LinkedQueue implements Queue {

    private int length = 0;
    private ListEntry first, last;


    public void append(int value){
        ListEntry newEntry = new ListEntry(value, null);
        if(this.isEmpty()){
            first = newEntry;
            last = newEntry;
        }
        else{
            last.setNext(newEntry);
            last = newEntry;
        }
        length++;
    }

    public boolean isEmpty(){
        if(this.length == 0){
            return true;
        }
        else return false;
    }

    public void remove(){
        if(this.isEmpty() == false){
            first = first.getNext();
            length--;
        }
        if(this.isEmpty()){
            last = null;
        }

    }

    public int peek(){
        if(this.isEmpty()){
            return EMPTY_VALUE;
        }
        else{
            return first.getValue();
        }
    }

    public int[] toArray(){
        int[] values = new int[this.length];
        ListEntry temp = first;
        for(int i = 0; i < this.length; i++){
            values[i] = temp.getValue();
            temp = temp.getNext();
        }
        return values;
    }
    
}

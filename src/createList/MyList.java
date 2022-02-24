package createList;

public class MyList {
    private boolean isEmpty = true;
    private int size;

    public boolean isEmpty() {
        return isEmpty;
    }
    public void add(String item){
        size++;
    }

    public int size() {
        return size;
    }
}

package ispirer_systems.tasks.Task2;


import static ispirer_systems.tasks.Task2.Listener.changed;

public class MyList<T> {

    private int size;

    private Object [] elements = {};

    public MyList(){
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void changeSize(int newSize){
        Object [] newElements = new Object[newSize];
        System.arraycopy(elements, 0, newElements, 0, size-1);
        size = newElements.length;
        elements = newElements;
        changed(size);
    }

    private boolean checkIndex(int index){
        return index <= size - 1 && index >= 0;
    }

    public void add(T object){
        changeSize(++size);
        this.elements[elements.length-1] = object;
    }

    public void add(int index, T element){
        if(checkIndex(index)){
            changeSize(++size);
            if (size - 2 - (index - 1) >= 0)
                System.arraycopy(elements, index, elements, index + 1, size - 2 - (index - 1));
            elements[index] = element;
        }
        else {
            System.out.println("Illegal index: " + index);
        }
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public boolean contains(T object){
        for (int i = 0; i < size(); i++) {
            if (object.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T object) {
        for (int i = 0; i < size(); i++) {
            if (object.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        if(checkIndex(index)){
            if (size - 1 - index >= 0) System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
            changeSize(size-1);
        }else {
            System.out.println("Illegal index: " + index);
        }
    }

    public void clear(){
        size = 0;
        elements = new Object[0];
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<size; i++){
            result.append(elements[i]);
            result.append(" ");
        }
        return result.toString();
    }
}

package pl.sdacademy.java16poz.programowanie1.lists.doublelinkedlist;

import pl.sdacademy.java16poz.programowanie1.lists.List;

public class DoubleLinkedListImpl<T> implements List<T> {
    @Override
    public void add(T element) {


    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        int size = 0;
        Node element = null;
        Node Node = element;
        while (Node != null){
            size++;
            Node = Node.next;
        }
        return size;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public void set(int index, T value) {

    }

    @Override
    public void clear() {
        clear();

    }
}

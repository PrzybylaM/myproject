package programowanie1.lists.slack;

import lists.linkedlist.Node;
import obiekty.Book;

import java.util.Optional;

public class StackImpl<T> implements Stack<T> {

    private Node<T> top;

    @Override
    public void push(T element) {
        //jeśli topp jest nullem
        //tworzymy nowy node
        Node<T> node = new Node<T>(element);
        //jeśli top nie ejst nullem
        //tworzymy nowy node
        //jego następnikiem jest top
        //nowy stworzony jest teraz popem
        if (isEmpty()) {
            top = node;
        }else{
            node.next = top;
            top = node;

        }
    }

    @Override
    public Optional<T> pop() {
        if (isEmpty()){
            return Optional.empty();
        }else{
            Optional<T> value = Optional.of(top.value);
            top = top.next;
            return value;
        }
    }

    @Override
    public Optional<T> peek() {
        if (isEmpty()){
            return Optional.empty();
        }else {
            return Optional.of(top.value);
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toCoolString() {
        return null;
    }
}

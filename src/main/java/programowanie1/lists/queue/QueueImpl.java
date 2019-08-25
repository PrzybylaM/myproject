package programowanie1.lists.queue;

import lists.linkedlist.Node;

import java.util.Optional;

public class QueueImpl<T> implements Queue <T> {

    Node<T> back;
    Node<T> front;

    @Override
    public void enqueue(T element) {
        if (isEmpty()){
            Node<T> node = new Node<>(element);
            back = node;
            front = node;
        }else {
            Node<T> node = new Node<>(element);
            back.next = node;
        }
    }

    @Override
    public Optional<T> dequeue() {
        if (isEmpty()){
            return Optional.empty();
        }else{
            Node<T> element = front;
            front = front.next;
            return Optional.of(element.value);
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Optional<T> peek() {
        if (isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(front.value);
        }
    }
}

package module01.Part02.myLinkedList;

import module01.Part02.myLinkedList.Node;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private int size;
    private Node<E> head;

    public MyLinkedList(Node<E> head) {
        this.size++;
        this.head = head;
    }

    public void addTail(Node<E> tail) {
        if (head == null) {
            head = tail;
        } else {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(tail);
        }
        size++;
    }

    public void addHead(Node<E> newHead) {
        newHead.setNext(head);
        head = newHead;
        size++;
    }

    public int getSize() {
        int size1 = 0;
        Node<E> curr = head;
        while (curr != null) {
            curr = curr.getNext();
            size1++;
        }
        return size1;
    }

    public int getIndex(Object O) {
        int index = 0;
        Node<E> curr = head;
        while (curr != null) {
            // Use .equals() method for comparison (assuming your data type supports it)
            if (curr.getData().equals(O)) {
                return index;
            }
            curr = curr.getNext();
            index++;
        }
        return -1;
    }

    public void getDara(Object O) {
        int index = 0;
        Node<E> curr = head;
        while (curr != null) {
            if (curr.getData().equals(O)) {
                System.out.println(index);
            }
            index++;
            curr = curr.getNext();
        }
    }

    public void updateIndex(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        curr.setData(newValue);
        System.out.println(newValue);
    }

    public void removeObject(E data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<E> curr = head;
        while (curr.getNext() != null) {
            if (curr.getNext().getData().equals(data)) {
                curr.setNext(curr.getNext().getNext());
                size--;
                return;
            }
            curr = curr.getNext();
        }

        throw new NoSuchElementException("Element not found linkedlist: " + data);
    }

    public void deleteIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            head = head.getNext();
            System.out.println("Removing head element");
        } else {
            Node<E> curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> curr = head;
        while (curr != null) {
            stringBuilder.append(curr);
            curr = curr.getNext();
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }
}

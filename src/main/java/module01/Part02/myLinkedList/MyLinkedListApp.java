package module01.Part02.myLinkedList;

public class MyLinkedListApp {
    public static void main(String[] args) {
        final Node<Integer> head = new Node<Integer>(10);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(head);
        System.out.println(myLinkedList);
        Node<Integer> integerNode1 = new Node<>(11);
        myLinkedList.addTail(integerNode1);
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(12));
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(13));
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(14));
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(15));
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(16));
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(19));
        System.out.println(myLinkedList);
        myLinkedList.addTail(new Node<>(9));
        System.out.println(myLinkedList);
        myLinkedList.addHead(new Node<>(7));
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.getIndex(11));
        myLinkedList.getDara(7);
        myLinkedList.getDara(11);
        myLinkedList.removeObject(13);
        System.out.println(myLinkedList.getSize());
        //   myLinkedList.removeObject(13); //throw exception if a value doesn't exist
        System.out.println(myLinkedList.getSize());
        myLinkedList.updateIndex(2, 5);
        System.out.println(myLinkedList);
        myLinkedList.deleteIndex(2);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList);
        myLinkedList.deleteIndex(0);
        System.out.println(myLinkedList.getSize());
    }
}

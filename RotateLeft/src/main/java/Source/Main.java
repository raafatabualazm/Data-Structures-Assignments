package Source;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertLast(22);
        myList.insertLast(33);
        myList.insertLast(44);
        myList.insertLast(55);
        myList.insertLast(66);
        myList.insertLast(77);
        myList.insertLast(88);
        myList.insertLast(99);
        myList.displayList();
        System.out.println("New List after Rotation");
        myList.RotateLeft();
        myList.displayList();
    }
}

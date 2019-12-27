
public class Main {
    public static void main(String[] args) {
        LinkedList failed = new LinkedList();
        LinkedList succeeded = new LinkedList();
        Link student = new Link("Ahmed", 20, 10);
        failed.insertfirst(student);
        Link student2 = new Link("Mohamed", 25, 100);
        failed.insertfirst(student2);
        Link student3 = new Link("Raafat", 22, 20);
        failed.insertfirst(student3);
        Link student4 = new Link("Omar", 21, 90);
        failed.insertfirst(student4);
        Link student5 = new Link("Mona", 22,30);
        failed.insertfirst(student5);
        Link student6 = new Link("Ali" , 25, 80);
        failed.insertfirst(student6);
        Link student7 = new Link("Masood", 28, 40);
        failed.insertfirst(student7);
        Link student8 = new Link("Fathy", 18, 70);
        failed.insertfirst(student8);
        Link student9 = new Link("Sara", 15, 50);
        failed.insertfirst(student9);
        Link student10 = new Link("Farah", 20, 60);
        failed.insertfirst(student10);
        Link curr = failed.first;
        Link prev = null;

        while (curr != null) {
            if (curr.degree >= 50) {
               if (curr != failed.first) {
                    prev.next = curr.next;
                } else {
                    failed.first = curr.next;
                }
                succeeded.insertfirst(curr);

            }

            prev = curr;
            curr = curr.next;
        }
        failed.displaylist();
        System.out.println("Another List");
        succeeded.displaylist();

    }
}

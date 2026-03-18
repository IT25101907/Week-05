package Exercise1;

public class Exercise1Main {

        public static void main(String[] args) {
            Exercise1LinkedList list = new Exercise1LinkedList();

            list.insertFirst(101, 85);
            list.insertFirst(102, 90);
            list.insertFirst(103, 75);

            System.out.println("List after insertions:");
            list.displayList();

            list.delete(102);
            System.out.println("After deleting ID 102:");
            list.displayList();

            list.deleteFirst();
            System.out.println("After deleting first:");
            list.displayList();
        }
    }


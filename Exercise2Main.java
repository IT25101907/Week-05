package Exercise2;

public class Exercise2Main {

        public static void main(String[] args) {
            Exercise2BookLinkedList list = new Exercise2BookLinkedList();

            list.insertFirst(1, "Hello", 15);
            list.insertFirst(2, "World", 4);
            list.insertFirst(3, "Welcome", 8);

            System.out.println("Initial books:");
            list.displayList();

            list.insertAfter(1, 4, "New Book", 10);

            System.out.println("After inserting after ID 1:");
            list.displayList();

            System.out.println("Finding book ID 2:");
            Exercise2BookLink found = list.find(2);
            if (found != null) found.displayLink();

            list.delete(2);
            System.out.println("After deleting ID 2:");
            list.displayList();

            list.deleteFirst();
            System.out.println("After deleting first:");
            list.displayList();
        }
    }


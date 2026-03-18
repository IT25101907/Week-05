package Exercise2;

 class Exercise2BookLinkedList {

         private Exercise2BookLink first;

         public Exercise2BookLinkedList() {
             first = null;
         }

         public boolean isEmpty() {
             return first == null;
         }

         public void insertFirst(int id, String title, int copies) {
             Exercise2BookLink newLink = new Exercise2BookLink(id, title, copies);
             newLink.next = first;
             first = newLink;
         }

         public void insertAfter(int key, int id, String title, int copies) {
             Exercise2BookLink current = first;

             while (current != null && current.id != key) {
                 current = current.next;
             }

             if (current != null) {
                 Exercise2BookLink newLink = new Exercise2BookLink(id, title, copies);
                 newLink.next = current.next;
                 current.next = newLink;
             }
         }

         public Exercise2BookLink find(int key) {
             Exercise2BookLink current = first;

             while (current != null) {
                 if (current.id == key) return current;
                 current = current.next;
             }
             return null;
         }

         public Exercise2BookLink deleteFirst() {
             if (isEmpty()) return null;

             Exercise2BookLink temp = first;
             first = first.next;
             return temp;
         }

         public Exercise2BookLink delete(int key) {
             Exercise2BookLink current = first;
             Exercise2BookLink previous = null;

             while (current != null && current.id != key) {
                 previous = current;
                 current = current.next;
             }

             if (current == null) return null;

             if (current == first) {
                 first = first.next;
             } else {
                 previous.next = current.next;
             }

             return current;
         }

         public void displayList() {
             Exercise2BookLink current = first;
             while (current != null) {
                 current.displayLink();
                 current = current.next;
             }
         }
     }


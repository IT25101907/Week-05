package Exercise1;

class Exercise1LinkedList {

        private Exercise1Link first;

        public Exercise1LinkedList() {
            first = null;
        }

        public boolean isEmpty() {
            return (first == null);
        }


        public void insertFirst(int id, int marks) {
            Exercise1Link newLink = new Exercise1Link(id, marks);
            newLink.next = first;
            first = newLink;
        }


        public void insertAfter(int key, int id, int marks) {
            Exercise1Link current = first;

            while (current != null && current.id != key) {
                current = current.next;
            }

            if (current != null) {
                Exercise1Link newLink = new Exercise1Link(id, marks);
                newLink.next = current.next;
                current.next = newLink;
            } else {
                System.out.println("Key not found!");
            }
        }


        public Exercise1Link find(int key) {
            Exercise1Link current = first;

            while (current != null) {
                if (current.id == key) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }


        public Exercise1Link deleteFirst() {
            if (isEmpty()) return null;

            Exercise1Link temp = first;
            first = first.next;
            return temp;
        }


        public Exercise1Link delete(int key) {
            if (isEmpty()) return null;

            Exercise1Link current = first;
            Exercise1Link previous = null;

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
            Exercise1Link current = first;
            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }
    }


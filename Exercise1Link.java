package Exercise1;

class Exercise1Link {

        int id;
        int marks;
        Exercise1Link next;

        public Exercise1Link(int id, int marks) {
            this.id = id;
            this.marks = marks;
            this.next = null;
        }

        public void displayLink() {
            System.out.println("ID: " + id + ", Marks: " + marks);
        }
    }


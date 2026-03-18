package Exercise2;

 class Exercise2BookLink {

         int id;
         String title;
         int copies;
         Exercise2BookLink next;

         public Exercise2BookLink(int id, String title, int copies) {
             this.id = id;
             this.title = title;
             this.copies = copies;
             this.next = null;
         }

         public void displayLink() {
             System.out.println("ID: " + id + ", Title: " + title + ", Copies: " + copies);
         }
     }


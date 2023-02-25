package Array1d;

public class LinkedListIntersection {


//    public class LinkedListIntersection {
        //h1---> head of 1st LinkedList
        //h2---> head of 2nd LinkedList
        static LinkedListNode h1, h2; // head of 1st nd 2nd

        static class LinkedListNode {
            int a;
            LinkedListNode next;

            LinkedListNode(int a) {
                this.a = a;
                next = null;
            }
        }

        //method for getting intersection point
        int getIntersectionNode(LinkedListNode list1, LinkedListNode list2) {
            while (list1 != null) {
                LinkedListNode curr2 = list2;
                while (curr2 != null) {
                    if (list1.a == curr2.a) {
                        return list1.a;
                    }
                    curr2 = curr2.next;
                }
                list1 = list1.next;
            }


            return -1;
        }

        void displayNodes(LinkedListNode list1) {
            while (list1 != null) {
                System.out.println(list1.a + " ");
                list1 = list1.next;
            }
        }

        public static void main(String[] args) {
            LinkedListIntersection l1 = new LinkedListIntersection();
            //creating 1st linkedList
            l1.h1 = new LinkedListNode(1);
            l1.h1.next = new LinkedListNode(2);
            l1.h1.next.next = new LinkedListNode(3);
            l1.h1.next.next.next = new LinkedListNode(4);
            l1.h1.next.next.next.next = new LinkedListNode(5);
            System.out.println("first LinkedList: " +" ");
            l1.displayNodes(l1.h1);
            System.out.println();

            //2nd LinkedList
            l1.h2 = new LinkedListNode(9);
            l1.h2.next = new LinkedListNode(8);
            l1.h2.next.next = new LinkedListNode(6);
            l1.h2.next.next.next = new LinkedListNode(3);
            l1.h2.next.next.next.next = new LinkedListNode(4);
            l1.h2.next.next.next.next.next = new LinkedListNode(5);
            System.out.println("second LinkedList: " +" ");
            l1.displayNodes(l1.h2);
            System.out.println();


            System.out.print("interSection point is : " + l1.getIntersectionNode(l1.h1, l1.h2));

        }
    }

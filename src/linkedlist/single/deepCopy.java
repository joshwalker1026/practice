package linkedlist.single;

public class deepCopy {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this. val = val;
            this.next =null;
        }

        Node(int val, Node next) {
            this. val = val;
            this.next =next;
        }

    }

    public static void printList(Node node){
        while (node!=null){
            System.out.print(node.val);

            if (node.next != null)
                System.out.print("->");

            node=node.next;
        }

        System.out.println();
    }


    public static Node deepCopyList(Node head){
        Node headC = new Node(head.val);

        Node curr = head;
        Node currC = headC;
        
        while (curr!=null){
            curr = curr.next;

            if (curr!=null) {
                currC.next = new Node(curr.val);
                currC = currC.next;
            }
        }

        return headC;
    }


    public static void main(String[] args){

        Node head = new Node(1);
        Node tmp2 = new Node(2);
        Node tmp3 = new Node(3);
        Node tmp4 = new Node(4);


        head.next = tmp2;
        tmp2.next = tmp3;
        tmp3.next = tmp4;


        Node copied = deepCopyList(head);
        printList(head);
        printList(copied);

    }


}

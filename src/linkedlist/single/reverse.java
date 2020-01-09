package linkedlist.single;

public class reverse {

    static class node {
        int val;
        node next;

        node (int val){
            this.val = val;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        // Initilize
        node head = new node(-1);
        node it= head;
        it.next = new node(3);
        it= it.next;
        it.next = new node(4);
        it= it.next;
        it.next = new node(5);


        it = head.next;

        while (it != null){
            System.out.println(it.val);
            it = it.next;
        }

        it = reverse(head);

        while (it != null){
            System.out.println(it.val);
            it = it.next;
        }

    }


    protected static node reverse(node head){

        node current = head.next;
        node prev = null;
        node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}

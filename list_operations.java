/* insert an element at a particular index;
 if element exists in  a linked list


 */
import java.util.*;
 class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = null;
    }
 }

public class listTrsining {

    public static void printList( Node head){

        while(head != null){

            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static Node removeList(Node head, int pos){
        Node h = head;
        pos--;
        while(head != null){
            if(pos == 1){
                head.next = head.next.next;
                return h;
            }
            head = head.next;
            pos--;
        }
        return h;
    };

    public static Node insertList(Node head, int pos, int data){
        Node h = head;
        pos--;
        while(head != null){
            if(pos == 1){
                Node newNode = new Node(data, null);
                newNode.next = head.next;
                head.next = newNode;
                return h;
            }
            head = head.next;
            pos--;
        }
        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(0, null), H = head;
        while (true) { 
            int num = sc.nextInt();
            
            if(num == -1) break;

            Node tail = new Node(num, null);
            head.next = tail;
            head = head.next;
        }
        int pos = sc.nextInt();
        H = removeList(H.next, pos);
        printList(H);

        System.out.println("ENter a position and data to insert");
        pos = sc.nextInt();
        int data = sc.nextInt();

        H = insertList(H, pos, data);
        printList(H);

    }
}

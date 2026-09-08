public class day10_llcreation{
    public static void main(String[] args) {
        node p1 = new node(10);
        node p2 = new node(20);
        node p3 = new node(30);
        node p4 = new node(40);

        p1.next = p2;
        p2.next = p3;   
        p3.next = p4;

        linkedlist ll = new linkedlist();
        ll.head =p1;
        ll.printlist();
        
        // linkedlist ll2 = new linkedlist();
        // ll2.add(100);
        // ll2.add(200);
    }
}

class node{
    int data;
    node next;  
    node(int data){
        this.data = data;
        next = null;
    }
}


class linkedlist{
    node head ;
    void printlist(){
        node curr = head;

        //  traversing the the entire linked list
        while(curr != null){
        System.out.println(curr.data);
        curr = curr.next;
        }

        // traversing still n-1
        // while(curr.next != null){
        //     System.out.println(curr.data);
        //     curr = curr.next;
        // }

        // use curr.next.next to traverse till n-2
    
    }
}

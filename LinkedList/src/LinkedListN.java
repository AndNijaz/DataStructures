public class LinkedListN {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    LinkedListN(){
        head = null;
    }

    public void insert(int d) {
        //Supporting variable for traversing
        Node temp = head;
        //Check if the list is empty
        if(temp == null) head = new Node(d);
        //Check if the first element of the list is greater than new entered element (and place it on the beginning)
        else if(d < head.data){
            head = new Node(d);
            head.next = temp;
        }
        else {
            //Traverse through the list to find where element should be located
            while(temp.next != null && temp.next.data < d){
                temp = temp.next;
            }
            //If we are on the last element, that means that our element will just be next element of the last element
            if(temp.next == null){
                temp.next = new Node(d);
            }
            //If we are somewhere in the middle, we have to make temporary object and which will be currentObject.next and then make new Object, place it on currentObject.next and then on the newObject.next place the tempoary object.
            else {
                Node temp2 = temp.next;
                temp = new Node(d);
                temp.next = temp2;
            }
        }
    }
    public void printList() {
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

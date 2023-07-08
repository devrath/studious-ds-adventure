package linkedList.singleList.mosh;

public class Demo {


    public static void main(String[] args){

        MoshLinkedList list = new MoshLinkedList(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        list.reverse();

        list.printElements();

    }


}

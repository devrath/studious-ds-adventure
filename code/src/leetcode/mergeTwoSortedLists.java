package leetcode;

public class mergeTwoSortedLists {

    public ListNode prepSetOne() {
        ListNode mNode1 = new ListNode(1);
        ListNode mNode2 = new ListNode(2);
        ListNode mNode3 = new ListNode(4);

        mNode1.next = mNode2;
        mNode2.next = mNode3;

        return mNode1;
    }

    public ListNode prepSetTwo() {
        ListNode mNode1 = new ListNode(1);
        ListNode mNode2 = new ListNode(3);
        ListNode mNode3 = new ListNode(4);

        mNode1.next = mNode2;
        mNode2.next = mNode3;

        return mNode1;
    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node to start
        ListNode returnNode = new ListNode(Integer.MAX_VALUE);

        // Keep a reference to the head node
        ListNode headNode = returnNode;

        // Traverse till one of the list reaches the end
        while(list1!=null && list2!=null) {
            // This loop should fail when one of the list has reached the end

            // Compare the two values of the lists
            if(list1.val >= list2.val) {
                // Attach the ``list2`` node to ``return`` node
                returnNode.next = list2;
                // Move the pointer of ``list2`` to next node to be traversed
                list2 = list2.next;
            }else{
                // Attach the ``list1`` node to ``return`` node
                returnNode.next = list1;
                // Move the pointer of ``list1`` to next node to be traversed
                list1 = list1.next;
            }

            // Move the pointer to next since a new node is attached
            returnNode = returnNode.next;

        }

        // Append the remaining list
        if (list1 == null) {
            returnNode.next = list2;
        } else if (list2 == null) {
            returnNode.next = list1;
        }

        // return the next node to sentinel node
        return headNode.next;
    }


}

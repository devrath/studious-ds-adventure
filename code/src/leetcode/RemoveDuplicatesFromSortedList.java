package leetcode;

public class RemoveDuplicatesFromSortedList {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public ListNode deleteDuplicates(ListNode head) {

         if(head.next == null){
             return head;
         }

         ListNode prev = head;
         ListNode temp = prev.next;

         while(temp!=null) {
             if(prev.val == temp.val){
                 // Move the temp pointer for next while loop iteration
                 temp = temp.next;
             }else{
                 // make the node at prev to point to temp
                 prev.next = temp;
                 // move the prev to temp position
                 prev = temp;
                 // Move the temp pointer for next while loop iteration
                 temp = temp.next;
             }
         }


        prev.next = null;
        return head;
    }


}

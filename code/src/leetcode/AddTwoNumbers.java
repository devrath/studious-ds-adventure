package leetcode;

public class AddTwoNumbers {


    public ListNode prepSetOne() {
        ListNode mNode1 = new ListNode(2);
        ListNode mNode2 = new ListNode(4);
        ListNode mNode3 = new ListNode(3);

        mNode1.next = mNode2;
        mNode2.next = mNode3;

        return mNode1;
    }

    public ListNode prepSetTwo() {
        ListNode mNode1 = new ListNode(5);
        ListNode mNode2 = new ListNode(6);
        ListNode mNode3 = new ListNode(4);

        mNode1.next = mNode2;
        mNode2.next = mNode3;

        return mNode1;
    }


     public class ListNode {
         int val;
         ListNode next;
         ListNode(int val) {
             this.val = val;
         }
         ListNode(int val, ListNode next) {
             this.val = val; this.next = next;
         }
     }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null && l2 !=null){
            return l2;
        }else if(l1 != null && l2 ==null){
            return l1;
        }

        ListNode resultList = null;
        ListNode head = null;
        int carry = 0;

        return asyncAddTwoNumbers(l1,l2,resultList,carry,head);
    }

    private ListNode asyncAddTwoNumbers(
            ListNode l1, ListNode l2,
            ListNode resultList, int carry,ListNode head) {

        if (l1==null && l2==null && carry==0) {
            return resultList;
        }

        int sum = 0;

        if(l1!=null){
            sum = sum + l1.val;
        }

        if(l2!=null){
            sum = sum + l2.val;
        }

        if(carry!=0){
            sum = sum + carry;
        }

        carry = sum/10;
        sum = sum%10;

        ListNode newNode = new ListNode(sum);

        if(resultList!=null){
            ListNode current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next = newNode;
        }else{
            resultList = newNode;
            head = newNode;
        }

        ListNode newNode1 = null;
        ListNode newNode2 = null;

        if(l1!=null){
            newNode1 = l1.next;
        }

        if(l2!=null){
            newNode2 = l2.next;
        }

        return asyncAddTwoNumbers(newNode1,newNode2,resultList,carry,head);
    }


}

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //=================our result ListNode====================
    ListNode head = new ListNode(0);
    //=================to assign the next to head=============
    ListNode curr = head;
    int carry = 0;

    //===================for adding numbers in ListNode=======
    while (l1 != null || l2 != null || carry != 0){
      int x = l1.val;
      int y = l2.val;
      int sum = carry + x + y;
      carry = sum / 10;
      //==========beautiful recursion=============
      curr.next = new ListNode(sum % 10);
      curr = curr.next;

      //============initialization of next number=============
      l1 = l1.next; // 4
      l2 = l2.next; // 6
    }
    // head == 0, head.next = 7
    return head.next;
  }
}

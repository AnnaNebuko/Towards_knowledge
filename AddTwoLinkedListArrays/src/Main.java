public class Main {

  public static void main(String[] args) {
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4, listNode3);
    ListNode listNode2 = new ListNode(2, listNode4);

    ListNode listNode4Second = new ListNode(4);
    ListNode listNode6 = new ListNode(6, listNode4Second);
    ListNode listNode5 = new ListNode(5, listNode6);

    Solution solution = new Solution();

    ListNode listNode = solution.addTwoNumbers(listNode2, listNode5);

    ListNode.print(listNode);
  }
}



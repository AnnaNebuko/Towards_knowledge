import java.util.Objects;

public class ListNode {
     int val;
     ListNode next;

     ListNode(int val) {
          this.val = val;
     }

     ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
     }

     public int getVal() {
          return val;
     }

     public static void print(ListNode listNode) {
          System.out.print(listNode.getVal());
          while (Objects.nonNull(listNode.next)) {
               System.out.print(listNode.next.getVal());
               listNode = listNode.next;
          }
     }
}

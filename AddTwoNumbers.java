public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode num1 = new ListNode(2);
        ListNode num2 = new ListNode(1);
        ListNode num3 = new ListNode(4);
        l1.next = num1;
        num1.next = num2;
        num2.next = num3;


        ListNode l2 = new ListNode(7);
        ListNode num4 = new ListNode(0);
        ListNode num5 = new ListNode(0);
        ListNode num6 = new ListNode(5);
        l2.next = num4;
        num4.next = num5;
        num5.next = num6;
        // 5 ->  2 -> 1 -> -4
        // 7 -> 0 -> 0 -> 5
        // 2 -> 3 -> 1 -> 9
        ListNode list = addTwoNumbers(l1, l2);
        while(list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0); // creating an dummy list
        ListNode curr = dummy; // intialising an pointer
        int carry = 0; // intialising our carry with 0 intiall
        // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it.
        // We will add that as well into our list
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; // intialising our sum
            if(l1 != null){ // adding l1 to our sum & moving l1
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ // adding l2 to our sum & moving l2
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // if we have carry then add it into our sum
            carry = sum/10; // if we get carry, then divide it by 10 to get the carry
            ListNode node = new ListNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
            curr.next = node; // curr will point to that new node if we get
            curr = curr.next; // update the current every time
        }
        return dummy.next; // return dummy.next bcz, we don't want the value we have consider in it intially!!
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

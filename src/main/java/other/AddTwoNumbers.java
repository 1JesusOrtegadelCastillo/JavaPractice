package other;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode result = new ListNode(-1);
        ListNode ptr = result;
        int sum = 0;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (carry > 0) {
                sum += carry;
                carry = 0;
            }

            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            }

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            sum = 0;
        }

        return result.next;
    }
}

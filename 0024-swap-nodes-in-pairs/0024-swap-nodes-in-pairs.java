class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode prev = temp;

        while(head!= null && head.next!=null)
        {
            ListNode first=head;
            ListNode second = head.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;
            prev= first;
            head=first.next;

        }
        return temp.next;
    }
}
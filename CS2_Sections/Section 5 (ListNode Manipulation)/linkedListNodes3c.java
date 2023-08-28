ListNode temp = new ListNode(3, p.next);
p.next = temp;
temp.next = p.next.next;

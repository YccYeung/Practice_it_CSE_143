ListNode q = p;
p = p.next;
q.next = q.next.next;
p.next = null;

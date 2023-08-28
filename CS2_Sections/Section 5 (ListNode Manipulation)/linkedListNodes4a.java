ListNode q = p;
p = p.next.next;
q.next.next = null;
p.next = q.next;
q.next = null;
p.next.next = q;

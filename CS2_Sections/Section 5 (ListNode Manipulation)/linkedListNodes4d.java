p.next.next.next = q.next;
q.next = null;
p.next.next.next.next = q;
q = p.next.next;
p.next.next = null;
q.next.next.next = p;
p = null;
p = q.next.next.next.next;
q.next.next.next.next = null;
p.next = q.next.next.next;
q.next.next.next = null;
p.next.next = q.next.next;
q.next.next = null;
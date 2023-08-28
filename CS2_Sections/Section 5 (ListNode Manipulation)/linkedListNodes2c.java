q.next.next = p;
p = p.next;
q.next.next.next = null;
p.next = q.next;
q.next = q.next.next;
p.next.next = null;

p.next.next = q.next;
q.next = null;
q.next = p.next;
p.next = q;
q = p.next.next;
p.next.next = q.next.next;
q.next.next = null;

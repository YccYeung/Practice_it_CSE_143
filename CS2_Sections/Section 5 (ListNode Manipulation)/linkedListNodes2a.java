q.next.next = p.next;
p.next = null;
p.next = q;
q = p.next.next.next;
p.next.next.next = null;
q.next = p.next.next;
p.next.next = q;

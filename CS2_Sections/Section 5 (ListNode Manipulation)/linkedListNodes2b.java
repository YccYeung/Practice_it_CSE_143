p.next = q;
q = p.next.next;
q = p;
p = p.next.next;
q.next.next = null;

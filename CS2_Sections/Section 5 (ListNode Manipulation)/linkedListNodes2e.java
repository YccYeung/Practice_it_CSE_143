ListNode q = p;

//p -> [5] -> [4] -> [3] 
//q -> [5] -> [4] -> [3] 

p.next.next.next = q.next.next;

//p -> [5] -> [4] -> [3] -> [3]
//q -> [5] -> [4]  

q = q.next;

//p -> [5] -> [4] -> [3] -> [3]
//q -> [4]

p.next.next.next.next = null;

//p -> [5] -> [4] -> [3]
//q -> [4]

p.next = p.next.next;

q.next = p;

p = q;

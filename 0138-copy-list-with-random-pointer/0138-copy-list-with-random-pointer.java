
//Definition for singly-linked list.


class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (curr != null) {
            Node copy = new Node(curr.val);
            map.put(curr, copy);
            curr=curr.next;
        }
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr=curr.next;
        }
        return map.get(head);
    }
}





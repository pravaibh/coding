
//REVERSE A LINKED LIST.
static SinglyLinkedListNode reverseLL(SinglyLinkedListNode head, SinglyLinkedListNode prev,         SinglyLinkedListNode newHead) {
        
        if(head == null) {
            newHead = prev;
            return newHead;
        }
        SinglyLinkedListNode next = head.next;
        head.next = prev;
        return reverseLL(next, head, newHead);
    }

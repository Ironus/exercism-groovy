class Node<T> {
    T value
    Node<T> previous
    Node<T> next

    Node(value, previous = null, next = null) {
        this.value = value
        this.previous = previous
        this.next = next
    }
}

class DoubleLinkedList<T> {
    Node head = null

    void push(T value) {
        if (!head) {
            head = new Node(value)
            return
        }

        Node node = head

        while (node.next) {
            node = node.next
        }

        Node newNode = new Node(value, node)
        node.next = newNode
    }

    T pop() {
        if (!head) return null

        Node node = head

        while (node.next) {
            node = node.next
        }
        
        if (node.previous) node.previous.next = null

        node.value
    }

    T shift() {
        if (!head) return null

        Node node = head

        while (node.next) {
            node = node.next
        }

        node.next = head
        head.previous = node

        head.next.previous = null
        head = head.next
        node.next.next = null

        pop()
    }

    void unshift(T value) {
        if (!head) { 
            push(value)
            return
        }

        Node newHead = new Node(value, null, head)
        head.previous = newHead
        head = newHead
    }

}

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
    Node tail = null

    void push(T value) {
        Node newNode = new Node(value, tail)

        if (tail)
            tail.next = newNode
        else
            head = newNode

        tail = newNode
    }

    T pop() {
        if (!tail) return null

        T value = tail.value

        if (tail.previous) {
            tail = tail.previous
            tail.next = null
        } else {
            tail = null
            head = null
        }

        value
    }

    T shift() {
        if (!head) return null

        T value = head.value

        if (head.next) {
            head = head.next
            head.previous = null
        } else {
            tail = null
            head = null
        }

        value
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

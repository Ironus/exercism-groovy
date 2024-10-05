class EmptyBufferException extends Exception {}
class FullBufferException extends Exception {}

class CircularBuffer {
    Integer[] buffer
    int tail = 0
    int head = 0
    int capacity
    
    CircularBuffer(int capacity) {
        buffer = new Integer[capacity]
        for (int i in 0..capacity - 1) { buffer[i] = null }
        this.capacity = capacity
    }
    
    def clear() {
        try {
            read()
            head = (head + 1) % capacity
        } catch(Exception e) {
            
        }
    }

    def read() {
        if (!buffer[tail]) throw new EmptyBufferException()
        def item = buffer[tail]
        buffer[tail++] = null
        tail %= capacity
        item
    }

    def write(int item) {
        if (buffer[head]) throw new FullBufferException()
        put(item)
    }

    def overwrite(int item) {
        try {
            write(item)
        } catch(Exception e) {
            put(item)
            tail = (tail + 1) % capacity
        }   
    }

    def put(int item) {
        buffer[head++] = item
        head %= capacity
    }
}

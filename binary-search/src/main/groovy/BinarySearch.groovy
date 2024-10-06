class BinarySearch {

    List data

    // You may assume for this exercise that the input data is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }

    int indexOf(item) {
        def start = 0
        def pivot = 0
        def end = data.size()
        def val

        while (val != item && start != end) {
            if (item < val) end = pivot
            else start = pivot
            
            pivot = (start + end).intdiv(2)
            val = data[pivot]

            if (start == pivot) {
                start = end
            }
        }

        if (start == end && val != item) pivot = -1

        pivot
    }

}

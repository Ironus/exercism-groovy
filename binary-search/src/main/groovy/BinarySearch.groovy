class BinarySearch {

    List data

    // You may assume for this exercise that the input data is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }

    int search(start, end, item) {
        def pivot = (start + end).intdiv(2)
        def value = data[pivot] 

        if (start > end) return -1
        else if (value == item) return pivot
        else if (value < item) return search(pivot + 1, end, item)
        else if (value > item) return search(start, pivot - 1, item)
    }

    int indexOf(item) {
       search(0, data.size(), item)
    }

}

class ListOps {

    static append(list1, list2) {
        list2.each{ list1 << it }
        list1
    }

    static concatenate(lists) {
        def result = []
        lists.each{ append(result, it) }
        result
    }

    static filter(list, fn) {
        def result = []
        list.each{ if (fn.call(it)) result << it }
        result
    }

    static length(list) {
        def length = 0
        list.each{ length++ }
        length
    }

    static map(list, fn) {
        def result = []
        list.each{ result << fn.call(it) }
        result
    }

    static foldl(list, fn, initial) {
        def acc = initial
        list.each{ acc = fn.call(acc, it) }
        acc
    }

    static foldr(list, fn, initial) {
        foldl(reverse(list), fn, initial)
    }

    static reverse(list) {
        def result = []
        def len = length(list)
        
        for(int i = len - 1; i >= 0; i--) {
            result << list[i]
        }

        result
    }

}

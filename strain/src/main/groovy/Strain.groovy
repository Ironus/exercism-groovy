class Strain {
    static Collection keep(Collection collection, Closure predicate) {
        def filtered = []
        collection.each { if (predicate.call(it)) filtered << it }

        filtered
    }

    static Collection discard(Collection collection, Closure predicate) {
        keep(collection, {!predicate(it)})
    }
}
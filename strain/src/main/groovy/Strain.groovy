class Strain {

    static Collection filter(Collection collection, Closure predicate, boolean expected) {
        collection.findResults{ (predicate.call(it) == expected) ? it : null }
    }

    static Collection keep(Collection collection, Closure predicate) {
        filter(collection, predicate, true)
    }

    static Collection discard(Collection collection, Closure predicate) {
        filter(collection, predicate, false)
    }
}
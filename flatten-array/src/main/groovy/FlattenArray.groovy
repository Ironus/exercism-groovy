class FlattenArray {
    static List flatten(List l) {
        l.flatten().grep{ it != null }
    }
}

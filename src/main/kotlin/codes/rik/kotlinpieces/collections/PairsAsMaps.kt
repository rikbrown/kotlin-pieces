package codes.rik.kotlinpieces.collections

/**
 * Just like [Map.mapValues], except works on a [Collection]<[Pair]>.
 * @see Map.mapValues
 */
fun <K, V, V2> Collection<Pair<K, V>>.mapValues(mapper: (K, V) -> V2)
        = map { (key, value) -> key to mapper(key, value) }


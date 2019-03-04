package codes.rik.kotlinbits.collections

import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder

fun <K, V> Collection<Pair<K, V>>.toMultimap(): Multimap<K, V> {
    return this.fold(
        MultimapBuilder
            .hashKeys()
            .arrayListValues()
            .build<K, V>()) { acc, (k, v) -> acc.apply { put(k, v) } }
}

fun <K, V, V2> Collection<Pair<K, V>>.mapValues(mapper: (V) -> V2) = map { it.first to mapper(it.second) }

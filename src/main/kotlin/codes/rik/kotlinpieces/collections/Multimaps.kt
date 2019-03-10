package codes.rik.kotlinpieces.collections

import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder

fun <K, V> Collection<Pair<K, V>>.toMultimap(): Multimap<K, V> {
    return this.fold(
        MultimapBuilder
            .hashKeys()
            .arrayListValues()
            .build<K, V>()) { acc, (k, v) -> acc.apply { put(k, v) } }
}



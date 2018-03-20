package codes.rik.kotlinbits.extensions

/**
 * Support nested map lookup using bracket syntax, for example:
 *
 * ```
 * return userWidgetCount[username][widgetType] ?: 0
 * ```
 *
 * @receiver Map
 */
operator fun <K, V> Map<K, V>?.get(key: K) = this?.get(key)

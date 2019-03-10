package codes.rik.kotlinpieces.types.enums

/**
 * An enum which can be reversed (i.e. an item can be retrieved by its value via [ofValue] (or the nullable [ofValueOrNull])
 */
abstract class ReversibleEnum<out T: Any, in V>(values: Array<T>, reverser: (T) -> V) {
    private val byValue = values.associateBy { reverser(it) }

    fun ofValue(value: V) = ofValueOrNull(value) ?: throw IllegalArgumentException("Unknown value: $value")
    fun ofValueOrNull(value: V) = byValue[value]
}
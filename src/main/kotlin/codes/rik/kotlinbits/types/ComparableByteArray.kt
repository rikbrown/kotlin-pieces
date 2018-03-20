package codes.rik.kotlinbits.types

/**
 * A [ByteArray] which implements [Object.equals] and [Object.hashCode]
 */
open class ComparableByteArray(val bytes: ByteArray) {
    override fun equals(other: Any?) = other is ComparableByteArray && bytes contentEquals other.bytes
    override fun hashCode() = bytes.contentHashCode()
}
package codes.rik.kotlinbits.extensions

import java.util.*

/**
 * Xor two bytes array together, byte per byte.
 */
infix fun ByteArray.xor (other: ByteArray): ByteArray {
    assert(size == other.size)
    val out = ByteArray(size)
    for (i in indices) out[i] = (this[i].toInt() xor other[i].toInt()).toByte()
    return out
}

fun ByteArray.bigEndian(): ByteArray {
    // Reverse and prepend a 0 (in order to force the positive sign).
    val reversed = ByteArray(size + 1)
    for (i in indices) reversed[size - i] = this[i]
    return reversed
}

val ByteArray.string: String
    get() = Arrays.toString(this)

val ByteArray.hexString: String
    get() = map { String.format("%02X", it) }.joinToString("")

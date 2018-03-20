package codes.rik.kotlinbits.types

import java.nio.charset.Charset

/**
 * An internet address - plain and simple
 */
data class InternetAddress(val address: String, val port: Int) {
    override fun toString() = "$address:$port"

    fun toByteArray(charset: Charset): ByteArray {
        return toString().toByteArray(charset)
    }
}
package codes.rik.kotlinbits.extensions

fun Number.toHexString() = Integer.toHexString(this.toInt()) // FIXME later
fun Number.toHexString(width: Int) = String.format("0x%0${width}X", this)

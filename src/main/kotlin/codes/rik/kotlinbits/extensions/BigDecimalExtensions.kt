package codes.rik.kotlinbits.extensions

import java.math.BigDecimal

fun BigDecimal.isZero() = this == BigDecimal.ZERO
fun BigDecimal.isNotZero() = !isZero()

package codes.rik.kotlinpieces.extensions

import java.math.BigDecimal

fun BigDecimal.isZero() = this == BigDecimal.ZERO
fun BigDecimal.isNotZero() = !isZero()

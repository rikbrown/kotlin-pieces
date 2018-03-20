package codes.rik.kotlinbits.extensions

import java.time.Duration

val Number.nanos get() = Duration.ofNanos(this.toLong())!!
val Number.millis get() = Duration.ofMillis(this.toLong())!!
val Number.seconds get() = Duration.ofSeconds(this.toLong())!!
val Number.minutes get() = Duration.ofMinutes(this.toLong())!!
val Number.hours get() = Duration.ofHours(this.toLong())!!
val Number.days get() = Duration.ofDays(this.toLong())!!

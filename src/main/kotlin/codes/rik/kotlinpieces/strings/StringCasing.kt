package codes.rik.kotlinpieces.strings

import com.google.common.base.CaseFormat
import org.atteo.evo.inflector.English
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

fun String.toSnakeCase(from: CaseFormat = CaseFormat.LOWER_CAMEL) = from.to(CaseFormat.LOWER_UNDERSCORE, this)
fun String.toCamelCase(from: CaseFormat = CaseFormat.LOWER_UNDERSCORE) =
    camelCaseCache.computeIfAbsent(this) { str -> from.to(CaseFormat.LOWER_CAMEL, str) }
fun String.pluralise() = pluralCache.computeIfAbsent(this, English::plural)

private val pluralCache: ConcurrentMap<String, String> = ConcurrentHashMap()
private val camelCaseCache: ConcurrentMap<String, String> = ConcurrentHashMap()
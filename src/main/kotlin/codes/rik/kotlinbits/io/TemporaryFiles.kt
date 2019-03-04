package codes.rik.kotlinbits.io

import java.io.Closeable
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.FileAttribute

class DeletingPath(private val path: Path): Closeable, Path by path {
    override fun close() {
        Files.walk(path)
            .sorted(Comparator.reverseOrder())
            .map(Path::toFile)
            .forEach { it.delete() }
    }
}

fun <T> Path.deletingAfter(fn: (Path) -> T) = DeletingPath(this).use(fn)

fun <T> createTempDirectory(prefix: String, vararg attrs: FileAttribute<*>, fn: (Path) -> T): T = Files.createTempDirectory(prefix, *attrs).deletingAfter(fn)


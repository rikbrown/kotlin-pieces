package codes.rik.kotlinpieces.collections

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class PairsAsMapsTest: Spek ({
    describe("Collection<Pair<K, V>>.mapValues") {
        val collection: List<Pair<String, Int>> = listOf(
            "a" to 1,
            "b" to 2,
            "c" to 3
        )

        context("just considering values") {
            val mappedCollection = collection.mapValues { _, num -> num * 2 }

            it("maps values") {
                assertThat(mappedCollection, equalTo(listOf(
                    "a" to 2,
                    "b" to 4,
                    "c" to 6
                )))
            }
        }
    }
})
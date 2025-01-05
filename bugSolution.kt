```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }.toMutableList()
    println(list) // Output: [1, 2, 3, 4, 5] (original list unchanged)
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }.toMutableMap()
    println(map) // Output: {a=1, b=2, c=3} (original map unchanged) 
    println(newMap) // Output: {a=1, c=3}

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }.toMutableSet()
    println(set) //Output: [1, 2, 3, 4, 5] (original set unchanged)
    println(newSet) // Output: [1, 3, 5] 
}
```
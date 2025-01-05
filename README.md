# Unexpected Behavior of removeIf on Mutable Collections in Kotlin

This repository demonstrates a potential source of confusion when using the `removeIf` function with mutable collections (Lists, Maps, and Sets) in Kotlin.  The `removeIf` function directly modifies the original collection, which may not be immediately apparent to all developers.

The `bug.kt` file showcases examples of using `removeIf` with different mutable collections, highlighting how the original collections are altered in place.

The `bugSolution.kt` provides the same functionality, but focuses on clearly indicating how `removeIf` operates and potential alternatives if you need to preserve the original collection.
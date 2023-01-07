## Usage:

1. Add to your `build.gradle`:
```gradle
dependencies {
    // ...
    implementation 'com.github.dergey:tuples:0.0.2'
}
```

2. Add to your `settings.gradle`:
```gradle
repositories {
    // ...
    maven { url "https://jitpack.io" }
}
```

3. In your code:
```kotlin
import by.sergey.zhuravlev.tuples.Tuples
import by.sergey.zhuravlev.tuples.Tuples.toTuple6

fun main() {
    val tuple = Tuples.of("say", "hi", "to", 5, "tuples!")
    println(tuple)

    val tupleFromList = listOf("say", "hi", "to", "tuples", "from", "list").toTuple6()
    println(tupleFromList)

    println(tupleFromList.mapT4 { "you" }.mapT5 { "tuples" })
}
```
console:
```
[say,hi,to,5,tuples!]
[say,hi,to,tuples,from,list]
[say,hi,to,you,tuples,list]
```

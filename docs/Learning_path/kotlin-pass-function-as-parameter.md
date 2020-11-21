## How to pass a function as a parameter in Kotlin

```kotlin
fun callee(functionToCallFromCallee: () -> Unit) {
    // calling it from inside
    println("Calling from callee()")
    functionToCallFromCallee()
}

fun functionToCall() {
    println(" > I am functionToCall()")
}

callee(functionToCallFromCallee = {
    functionToCall()
})
```

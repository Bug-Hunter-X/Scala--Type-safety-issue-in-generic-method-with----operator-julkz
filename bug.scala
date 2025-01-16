```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    if (this.value == other.value) {
      this.value
    } else {
      throw new IllegalArgumentException("Values are not equal")
    }
  }
}

val a = new MyClass(10)
val b = new MyClass(10)
val c = new MyClass("hello")
val d = new MyClass("hello")
a.myMethod(b) // This is fine
a.myMethod(c) // This will compile but will result in runtime error 
```
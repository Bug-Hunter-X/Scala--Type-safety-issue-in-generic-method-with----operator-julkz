```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Option[T] = {
    if (this.value == other.value) {
      Some(this.value)
    } else {
      None
    }
  }
}

val a = new MyClass(10)
val b = new MyClass(10)
val c = new MyClass("hello")
val d = new MyClass("hello")

a.myMethod(b) // Returns Some(10)
a.myMethod(c) // Returns None

//Using equals method
class MyClass2[T](val value: T) {
  def myMethod(other: MyClass2[T]): Option[T] = {
    if (this.value.equals(other.value)) {
      Some(this.value)
    } else {
      None
    }
  }
}
```
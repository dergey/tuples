package by.sergey.zhuravlev.tuples

open class Tuple3<T1, T2, T3> internal constructor(
  t1: T1,
  t2: T2,
  val t3: T3
  ) : Tuple2<T1, T2>(t1, t2) {

  override val size: Int
    get() = 3

  override fun <R> mapT1(transform: (t1: T1) -> R): Tuple3<R, T2, T3> {
    return Tuple3(transform(t1), t2, t3)
  }

  override fun <R> mapT2(transform: (t2: T2) -> R): Tuple3<T1, R, T3> {
    return Tuple3(t1, transform(t2), t3)
  }

  open fun <R> mapT3(transform: (t3: T3) -> R): Tuple3<T1, T2, R> {
    return Tuple3(t1, t2, transform(t3))
  }

  override fun get(index: Int): Any? {
    return when (index) {
      0 -> t1
      1 -> t2
      2 -> t3
      else -> null
    }
  }

  override fun toList(): List<Any?> {
    return listOf(t1, t2, t3)
  }

  override fun toArray(): Array<Any?> {
    return arrayOf(t1, t2, t3)
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    if (!super.equals(other)) return false

    other as Tuple3<*, *, *>

    if (t3 != other.t3) return false

    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode()
    result = 31 * result + (t3?.hashCode() ?: 0)
    return result
  }
}

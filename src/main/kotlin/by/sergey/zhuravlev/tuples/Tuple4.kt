package by.sergey.zhuravlev.tuples

open class Tuple4<T1, T2, T3, T4> internal constructor(
  t1: T1,
  t2: T2,
  t3: T3,
  val t4: T4
) : Tuple3<T1, T2, T3>(t1, t2, t3) {

  override val size: Int
    get() = 4

  override fun <R> mapT1(transform: (t1: T1) -> R): Tuple4<R, T2, T3, T4> {
    return Tuple4(transform(t1), t2, t3, t4)
  }

  override fun <R> mapT2(transform: (t2: T2) -> R): Tuple4<T1, R, T3, T4> {
    return Tuple4(t1, transform(t2), t3, t4)
  }

  override fun <R> mapT3(transform: (t3: T3) -> R): Tuple4<T1, T2, R, T4> {
    return Tuple4(t1, t2, transform(t3), t4)
  }

  open fun <R> mapT4(transform: (t4: T4) -> R): Tuple4<T1, T2, T3, R> {
    return Tuple4(t1, t2, t3, transform(t4))
  }

  override fun get(index: Int): Any? {
    return when (index) {
      0 -> t1
      1 -> t2
      2 -> t3
      3 -> t4
      else -> null
    }
  }

  override fun toList(): List<Any?> {
    return listOf(t1, t2, t3, t4)
  }

  override fun toArray(): Array<Any?> {
    return arrayOf(t1, t2, t3, t4)
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    if (!super.equals(other)) return false

    other as Tuple4<*, *, *, *>

    if (t4 != other.t4) return false

    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode()
    result = 31 * result + (t4?.hashCode() ?: 0)
    return result
  }
}
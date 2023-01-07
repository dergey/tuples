package by.sergey.zhuravlev.tuples

open class Tuple5<T1, T2, T3, T4, T5> internal constructor(
  t1: T1,
  t2: T2,
  t3: T3,
  t4: T4,
  val t5: T5
) : Tuple4<T1, T2, T3, T4>(t1, t2, t3, t4) {

  override val size: Int
    get() = 5

  override fun <R> mapT1(transform: (t1: T1) -> R): Tuple5<R, T2, T3, T4, T5> {
    return Tuple5(transform(t1), t2, t3, t4, t5)
  }

  override fun <R> mapT2(transform: (t2: T2) -> R): Tuple5<T1, R, T3, T4, T5> {
    return Tuple5(t1, transform(t2), t3, t4, t5)
  }

  override fun <R> mapT3(transform: (t3: T3) -> R): Tuple5<T1, T2, R, T4, T5> {
    return Tuple5(t1, t2, transform(t3), t4, t5)
  }

  override fun <R> mapT4(transform: (t4: T4) -> R): Tuple5<T1, T2, T3, R, T5> {
    return Tuple5(t1, t2, t3, transform(t4), t5)
  }

  open fun <R> mapT5(transform: (t5: T5) -> R): Tuple5<T1, T2, T3, T4, R> {
    return Tuple5(t1, t2, t3, t4, transform(t5))
  }

  override fun get(index: Int): Any? {
    return when (index) {
      0 -> t1
      1 -> t2
      2 -> t3
      3 -> t4
      4 -> t5
      else -> null
    }
  }

  override fun toList(): List<Any?> {
    return listOf(t1, t2, t3, t4, t5)
  }

  override fun toArray(): Array<Any?> {
    return arrayOf(t1, t2, t3, t4, t5)
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    if (!super.equals(other)) return false

    other as Tuple5<*, *, *, *, *>

    if (t5 != other.t5) return false

    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode()
    result = 31 * result + (t5?.hashCode() ?: 0)
    return result
  }
}

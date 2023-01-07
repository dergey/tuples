package by.sergey.zhuravlev.tuples

open class Tuple7<T1, T2, T3, T4, T5, T6, T7> internal constructor(
  t1: T1,
  t2: T2,
  t3: T3,
  t4: T4,
  t5: T5,
  t6: T6,
  val t7: T7
) : Tuple6<T1, T2, T3, T4, T5, T6>(t1, t2, t3, t4, t5, t6) {

  override val size: Int
    get() = 7

  override fun <R> mapT1(transform: (t1: T1) -> R): Tuple7<R, T2, T3, T4, T5, T6, T7> {
    return Tuple7(transform(t1), t2, t3, t4, t5, t6, t7)
  }

  override fun <R> mapT2(transform: (t2: T2) -> R): Tuple7<T1, R, T3, T4, T5, T6, T7> {
    return Tuple7(t1, transform(t2), t3, t4, t5, t6, t7)
  }

  override fun <R> mapT3(transform: (t3: T3) -> R): Tuple7<T1, T2, R, T4, T5, T6, T7> {
    return Tuple7(t1, t2, transform(t3), t4, t5, t6, t7)
  }

  override fun <R> mapT4(transform: (t4: T4) -> R): Tuple7<T1, T2, T3, R, T5, T6, T7> {
    return Tuple7(t1, t2, t3, transform(t4), t5, t6, t7)
  }

  override fun <R> mapT5(transform: (t5: T5) -> R): Tuple7<T1, T2, T3, T4, R, T6, T7> {
    return Tuple7(t1, t2, t3, t4, transform(t5), t6, t7)
  }

  override fun <R> mapT6(transform: (t6: T6) -> R): Tuple7<T1, T2, T3, T4, T5, R, T7> {
    return Tuple7(t1, t2, t3, t4, t5, transform(t6), t7)
  }

  open fun <R> mapT7(transform: (t7: T7) -> R): Tuple7<T1, T2, T3, T4, T5, T6, R> {
    return Tuple7(t1, t2, t3, t4, t5, t6, transform(t7))
  }

  override fun get(index: Int): Any? {
    return when (index) {
      0 -> t1
      1 -> t2
      2 -> t3
      3 -> t4
      4 -> t5
      5 -> t6
      6 -> t7
      else -> null
    }
  }

  override fun toList(): List<Any?> {
    return listOf(t1, t2, t3, t4, t5, t6, t7)
  }

  override fun toArray(): Array<Any?> {
    return arrayOf(t1, t2, t3, t4, t5, t6, t7)
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    if (!super.equals(other)) return false

    other as Tuple7<*, *, *, *, *, *, *>

    if (t7 != other.t7) return false

    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode()
    result = 31 * result + (t7?.hashCode() ?: 0)
    return result
  }
}

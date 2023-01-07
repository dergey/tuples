package by.sergey.zhuravlev.tuples

class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> internal constructor(
  t1: T1,
  t2: T2,
  t3: T3,
  t4: T4,
  t5: T5,
  t6: T6,
  t7: T7,
  val t8: T8
) : Tuple7<T1, T2, T3, T4, T5, T6, T7>(t1, t2, t3, t4, t5, t6, t7) {

  override val size: Int
    get() = 8
  
  override fun <R> mapT1(transform: (t1: T1) -> R): Tuple8<R, T2, T3, T4, T5, T6, T7, T8> {
    return Tuple8(transform(t1), t2, t3, t4, t5, t6, t7, t8)
  }

  override fun <R> mapT2(transform: (t2: T2) -> R): Tuple8<T1, R, T3, T4, T5, T6, T7, T8> {
    return Tuple8(t1, transform(t2), t3, t4, t5, t6, t7, t8)
  }

  override fun <R> mapT3(transform: (t3: T3) -> R): Tuple8<T1, T2, R, T4, T5, T6, T7, T8> {
    return Tuple8(t1, t2, transform(t3), t4, t5, t6, t7, t8)
  }

  override fun <R> mapT4(transform: (t4: T4) -> R): Tuple8<T1, T2, T3, R, T5, T6, T7, T8> {
    return Tuple8(t1, t2, t3, transform(t4), t5, t6, t7, t8)
  }

  override fun <R> mapT5(transform: (t5: T5) -> R): Tuple8<T1, T2, T3, T4, R, T6, T7, T8> {
    return Tuple8(t1, t2, t3, t4, transform(t5), t6, t7, t8)
  }

  override fun <R> mapT6(transform: (t6: T6) -> R): Tuple8<T1, T2, T3, T4, T5, R, T7, T8> {
    return Tuple8(t1, t2, t3, t4, t5, transform(t6), t7, t8)
  }

  override fun <R> mapT7(transform: (t7: T7) -> R): Tuple8<T1, T2, T3, T4, T5, T6, R, T8> {
    return Tuple8(t1, t2, t3, t4, t5, t6, transform(t7), t8)
  }

  fun <R> mapT8(transform: (t8: T8) -> R): Tuple8<T1, T2, T3, T4, T5, T6, T7, R> {
    return Tuple8(t1, t2, t3, t4, t5, t6, t7, transform(t8))
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
      7 -> t8
      else -> null
    }
  }

  override fun toList(): List<Any?> {
    return listOf(t1, t2, t3, t4, t5, t6, t7, t8)
  }

  override fun toArray(): Array<Any?> {
    return arrayOf(t1, t2, t3, t4, t5, t6, t7, t8)
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false
    if (!super.equals(other)) return false

    other as Tuple8<*, *, *, *, *, *, *, *>

    if (t8 != other.t8) return false

    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode()
    result = 31 * result + (t8?.hashCode() ?: 0)
    return result
  }
}

package by.sergey.zhuravlev.tuples

open class Tuple2<T1, T2> internal constructor(
  val t1: T1,
  val t2: T2
) : Tuple {

  override val size: Int
    get() = 2

  open fun <R> mapT1(transform: (t1: T1) -> R): Tuple2<R, T2> {
    return Tuple2(transform(t1), t2)
  }

  open fun <R> mapT2(transform: (t2: T2) -> R): Tuple2<T1, R> {
    return Tuple2(t1, transform(t2))
  }

  open operator fun get(index: Int): Any? {
    return when (index) {
      0 -> t1
      1 -> t2
      else -> null
    }
  }

  open fun toList(): List<Any?> {
    return listOf(t1, t2)
  }

  open fun toArray(): Array<Any?> {
    return arrayOf(t1, t2)
  }

  override fun iterator(): Iterator<Any?> {
    return toList().iterator()
  }

  override fun contains(element: Any?): Boolean {
    return toList().contains(element)
  }

  override fun containsAll(elements: Collection<Any?>): Boolean {
    return size >= elements.size && toList().containsAll(elements)
  }

  override fun isEmpty(): Boolean {
    return false
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Tuple2<*, *>

    if (t1 != other.t1) return false
    if (t2 != other.t2) return false

    return true
  }

  override fun hashCode(): Int {
    var result = t1?.hashCode() ?: 0
    result = 31 * result + (t2?.hashCode() ?: 0)
    return result
  }

  override fun toString(): String {
    return Tuples.tupleStringRepresentation(*toArray()).insert(0, '[').append(']')
      .toString()
  }
}

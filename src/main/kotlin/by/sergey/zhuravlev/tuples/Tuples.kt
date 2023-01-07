package by.sergey.zhuravlev.tuples

object Tuples {

    fun <T> Array<T>.toTuple(): Tuple {
        require(this.size > 1) { "Too small array, size must be between 2 and 8" }
        when (this.size) {
            2 -> return of(
                this[0], this[1]
            )
            3 -> return of(
                this[0], this[1], this[2]
            )
            4 -> return of(
                this[0], this[1], this[2], this[3]
            )
            5 -> return of(
                this[0], this[1], this[2], this[3], this[4]
            )
            6 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5]
            )
            7 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6]
            )
            8 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7]
            )
        }
        throw IllegalArgumentException("Too big array (${this.size}), size must be between 2 and 8")
    }

    fun <T1, T2> of(
        t1: T1, 
        t2: T2
    ): Tuple2<T1, T2> {
        return Tuple2(t1, t2)
    }

    fun <T1, T2, T3> of(
        t1: T1,
        t2: T2, 
        t3: T3
    ): Tuple3<T1, T2, T3> {
        return Tuple3(t1, t2, t3)
    }

    fun <T1, T2, T3, T4> of(
        t1: T1, 
        t2: T2, 
        t3: T3, 
        t4: T4
    ): Tuple4<T1, T2, T3, T4> {
        return Tuple4(t1, t2, t3, t4)
    }

    fun <T1, T2, T3, T4, T5> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5
    ): Tuple5<T1, T2, T3, T4, T5> {
        return Tuple5(t1, t2, t3, t4, t5)
    }

    fun <T1, T2, T3, T4, T5, T6> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6
    ): Tuple6<T1, T2, T3, T4, T5, T6> {
        return Tuple6(t1, t2, t3, t4, t5, t6)
    }

    fun <T1, T2, T3, T4, T5, T6, T7> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7
    ): Tuple7<T1, T2, T3, T4, T5, T6, T7> {
        return Tuple7(t1, t2, t3, t4, t5, t6, t7)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8
    ): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> {
        return Tuple8(t1, t2, t3, t4, t5, t6, t7, t8)
    }

    fun tupleStringRepresentation(vararg values: Any?): StringBuilder {
        val sb = StringBuilder()
        for (i in values.indices) {
            val t = values[i]
            if (i != 0) {
                sb.append(',')
            }
            if (t != null) {
                sb.append(t)
            }
        }
        return sb
    }
}

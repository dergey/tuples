package by.sergey.zhuravlev.tuples

object Tuples {

    fun Array<*>.toTuple(): Tuple {
        require(this.size > 1) { "Too small array, size must be between 2 and 10" }
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
            9 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8]
            )
            10 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9]
            )
        }
        throw IllegalArgumentException("Too big array (${this.size}), size must be between 2 and 10")
    }

    fun <T> Array<T>.toTuple2(): Tuple2<T, T> {
        require(this.size == 2) { "Invalid array size, size must be equal 2" }
        return of(this[0], this[1])
    }

    fun <T> Array<T>.toTuple3(): Tuple3<T, T, T> {
        require(this.size == 3) { "Invalid array size, size must be equal 3" }
        return of(this[0], this[1], this[2])
    }

    fun <T> Array<T>.toTuple4(): Tuple4<T, T, T, T> {
        require(this.size == 4) { "Invalid array size, size must be equal 4" }
        return of(this[0], this[1], this[2], this[3])
    }

    fun <T> Array<T>.toTuple5(): Tuple5<T, T, T, T, T> {
        require(this.size == 5) { "Invalid array size, size must be equal 5" }
        return of(this[0], this[1], this[2], this[3], this[4])
    }

    fun <T> Array<T>.toTuple6(): Tuple6<T, T, T, T, T, T> {
        require(this.size == 6) { "Invalid array size, size must be equal 6" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5])
    }

    fun <T> Array<T>.toTuple7(): Tuple7<T, T, T, T, T, T, T> {
        require(this.size == 7) { "Invalid array size, size must be equal 7" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6])
    }

    fun <T> Array<T>.toTuple8(): Tuple8<T, T, T, T, T, T, T, T> {
        require(this.size == 8) { "Invalid array size, size must be equal 8" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7])
    }

    fun <T> Array<T>.toTuple9(): Tuple9<T, T, T, T, T, T, T, T, T> {
        require(this.size == 9) { "Invalid array size, size must be equal 9" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8])
    }

    fun <T> Array<T>.toTuple10(): Tuple10<T, T, T, T, T, T, T, T, T, T> {
        require(this.size == 10) { "Invalid array size, size must be equal 10" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9])
    }

    fun List<*>.toTuple(): Tuple {
        require(this.size > 1) { "Too small list, size must be between 2 and 10" }
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
            9 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8]
            )
            10 -> return of(
                this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9]
            )
        }
        throw IllegalArgumentException("Too big list (${this.size}), size must be between 2 and 10")
    }

    fun <T> List<T>.toTuple2(): Tuple2<T, T> {
        require(this.size == 2) { "Invalid list size, size must be equal 2" }
        return of(this[0], this[1])
    }

    fun <T> List<T>.toTuple3(): Tuple3<T, T, T> {
        require(this.size == 3) { "Invalid list size, size must be equal 3" }
        return of(this[0], this[1], this[2])
    }

    fun <T> List<T>.toTuple4(): Tuple4<T, T, T, T> {
        require(this.size == 4) { "Invalid list size, size must be equal 4" }
        return of(this[0], this[1], this[2], this[3])
    }

    fun <T> List<T>.toTuple5(): Tuple5<T, T, T, T, T> {
        require(this.size == 5) { "Invalid list size, size must be equal 5" }
        return of(this[0], this[1], this[2], this[3], this[4])
    }

    fun <T> List<T>.toTuple6(): Tuple6<T, T, T, T, T, T> {
        require(this.size == 6) { "Invalid list size, size must be equal 6" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5])
    }

    fun <T> List<T>.toTuple7(): Tuple7<T, T, T, T, T, T, T> {
        require(this.size == 7) { "Invalid list size, size must be equal 7" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6])
    }

    fun <T> List<T>.toTuple8(): Tuple8<T, T, T, T, T, T, T, T> {
        require(this.size == 8) { "Invalid list size, size must be equal 8" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7])
    }

    fun <T> List<T>.toTuple9(): Tuple9<T, T, T, T, T, T, T, T, T> {
        require(this.size == 9) { "Invalid list size, size must be equal 9" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8])
    }

    fun <T> List<T>.toTuple10(): Tuple10<T, T, T, T, T, T, T, T, T, T> {
        require(this.size == 10) { "Invalid list size, size must be equal 10" }
        return of(this[0], this[1], this[2], this[3], this[4], this[5], this[6], this[7], this[8], this[9])
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

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9
    ): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> {
        return Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9,
        t10: T10
    ): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        return Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
    }
}

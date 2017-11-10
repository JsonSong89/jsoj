package com.jsonsong.test

import kotlin.test.assertEquals

/**
 * Created by jsons on 2016/4/25.
 */

fun Boolean.isTrue() {
    assert(this)
}

fun Boolean?.isTrue(): Boolean {
    return if (this == null) false else this
}

fun<T> T.isEqualAssert(value: T, str: String = "") {
    assertEquals(value, this, str)
}

fun<T> kotlin.collections.Collection<T>.hasValue(): Boolean {
    return true
}
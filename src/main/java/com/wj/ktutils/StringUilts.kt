@file:Suppress("NOTHING_TO_INLINE", "unused")
@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("WjStringsKt")
package com.wj.ktutils

import com.abase.util.AbStrUtil

/**
 * String扩展方法
 * @author Admin
 * @version 1.0
 * @date 2018/2/27
 */
inline fun CharSequence?.isNull(): Boolean =
        AbStrUtil.isEmpty(this.toString())

inline fun CharSequence?.isPhoneNum(): Boolean =
        AbStrUtil.isMobileNo(this.toString())

inline fun CharSequence?.isEmail(): Boolean =
        AbStrUtil.isEmail(this.toString())

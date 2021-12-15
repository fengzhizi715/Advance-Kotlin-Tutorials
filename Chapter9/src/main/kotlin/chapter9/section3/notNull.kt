package chapter9.section3

/**
 *
 * @FileName:
 *          chapter9.section3.notNull
 * @author: Tony Shen
 * @date: 2021/12/15 8:48 PM
 * @version: V1.0 <描述当前版本功能>
 */
inline fun <A, B, R> notNull(a: A?, b: B?,block: (A, B) -> R) {
    if (a != null && b != null) {
        block(a, b)
    }
}

inline fun <R> notNull(vararg args: Any?, block: () -> R) {
    when {
        args.filterNotNull().size == args.size -> block()
    }
}

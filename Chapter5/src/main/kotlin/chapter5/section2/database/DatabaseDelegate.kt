package chapter5.section2

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *
 * @FileName:
 *          chapter5.section2.DatabaseDelegate
 * @author: Tony Shen
 * @date: 2021/12/9 1:31 PM
 * @version: V1.0 <描述当前版本功能>
 */
class DatabaseDelegate<in R, T>(private val field: String, private val id: Int) : ReadWriteProperty<R, T> {

    override fun getValue(thisRef: R, property: KProperty<*>): T = queryForValue(field, id) as T

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        update(field, id, value)
    }
}

class NoRecordFoundException(id: Int) : Exception("No record found for id $id")

val data = arrayOf<MutableMap<String, Any?>>(
    mutableMapOf(
        "id" to 1,
        "name" to "Tony",
        "password" to "123456"
    ),
    mutableMapOf(
        "id" to 2,
        "name" to "Monica",
        "password" to "123456"
    )
)

fun queryForValue(field: String, id: Int): Any {

    val value = data.firstOrNull { it["id"] == id }?.get(field) ?: throw NoRecordFoundException(id)
    println("loaded value $value for field \"$field\" of record $id")
    return value
}


fun update(field: String, id: Int, value: Any?) {

    println("updating field \"$field\" of record $id to value $value")

    data.firstOrNull { it["id"] == id }
        ?.put(field, value)
        ?: throw NoRecordFoundException(id)
}

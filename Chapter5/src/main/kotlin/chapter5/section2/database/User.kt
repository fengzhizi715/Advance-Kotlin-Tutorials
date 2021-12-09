package chapter5.section2.database

import chapter5.section2.DatabaseDelegate

/**
 *
 * @FileName:
 *          chapter5.section2.database.User
 * @author: Tony Shen
 * @date: 2021/12/9 1:34 PM
 * @version: V1.0 <描述当前版本功能>
 */
class User(val id: Int) {

    var name: String by DatabaseDelegate("name", id) // 使用委托属性
    var password: String by DatabaseDelegate("password", id) // 使用委托属性
}

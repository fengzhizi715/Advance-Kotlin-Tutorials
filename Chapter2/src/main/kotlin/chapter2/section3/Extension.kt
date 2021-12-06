package chapter2.section3

import com.google.gson.Gson

/**
 *
 * @FileName:
 *          chapter2.section3.Extension
 * @author: Tony Shen
 * @date: 2021/12/6 9:40 PM
 * @version: V1.0 <描述当前版本功能>
 */
abstract class Message{
    abstract var action:String
}

data class PingMsg(override var action:String="ping"):Message()

data class PongMsg(override var action:String="pong"):Message()

data class AskMsg(override var action:String="ask",val body:Map<String,String>):Message()

fun main() {
    val gson = Gson()

    println(gson.toJson(PingMsg()))

    val map = mutableMapOf<String,String>()
    map.put("param1","tt")
    map.put("param2","qq")
    val msg = AskMsg(body = map)

    println(gson.toJson(msg))
}
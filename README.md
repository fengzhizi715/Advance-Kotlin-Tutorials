# Advance-Kotlin-Tutorials

[![@Tony沈哲 on weibo](https://img.shields.io/badge/weibo-%40Tony%E6%B2%88%E5%93%B2-blue.svg)](http://www.weibo.com/fengzhizi715)
[![License](https://img.shields.io/badge/license-Apache%202-lightgrey.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

此 repository 是本人《Kotlin 进阶实战》一书中的相关的例子。

勘误表地址：https://www.jianshu.com/p/cde13a905ade

# 各小节的例子

## Chapter 2
### 2.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Vararg1 |可变数量的参数的例子| |
| Vararg2 |可变数量的参数的例子|使用开运算符*|
| Vararg3 |可变数量的参数的例子|如果可变参数不是函数的最后一个参数，那么后面的参数需要通过命名参数来传值|
| Nothing |返回 Nothing 的函数的例子|
| LocalFunction |使用局部函数的例子|
| Tailrec1 |递归函数的例子|
| Tailrec2 |使用尾递归函数的例子|
| Main |无参的 main 函数的例子|

### 2.2 section 2

| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Constructor3 |使用次构造函数的例子||
| Constructor4 |类中出现多个初始化块、主构造函数、次构造函数的例子|
| Outter1 |使用嵌套类的例子||
| Outter2 |使用内部类的例子||

### 2.2 section 3

| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Singleton1 |使用对象声明实现单例模式||
| Singleton2 |使用伴生对象来创建懒汉模式的单例||
| Student |使用伴生对象的例子|
| DataClass |介绍 Data Class 的特性|Data Class 的拷贝为浅拷贝|
| Extension |使用继承的例子|Data Class 不能被继承|
| SealedClass |使用密封类的例子|


## Chapter 3
### 3.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Sum1 |函数可以作为其他函数的参数的例子||
| Sum2 |函数可以作为其他函数的返回值的例子||

### 3.2 section 2
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| SAM |在 Kotlin 1.4 之后，增加了支持 Kotlin 接口和函数的 SAM 转换||
| Lambda |展示了函数类型本质上实现了 kotlin.jvm.functions.FunctionN 接口||

### 3.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| SequenceBenchmark |使用jmh进行基准测试，对比 Sequence、List||


## Chapter 4
### 4.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Inline |inline 使用的例子||
| NoInline |禁用内联的例子||

### 4.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Extension1 |使用扩展函数的例子||
| Extension2 |扩展函数能否跟原先的函数重名|当扩展函数跟原先的函数重名，并且参数都相同时，扩展函数就会失效，调用的是原先类的函数。|

### 4.4 section 4
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Extension3 |使用扩展属性的例子||


## Chapter 5
### 5.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| ProxyDemo |Java 实现的静态代理的例子||
| DynamicProxyDemo |Java 实现的动态代理的例子||


### 5.2 section 2
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Delegate1 |Kotlin 实现委托模式的例子||
| Delegate2 |Kotlin 实现委托模式的另一个例子||
| Delegate3 |Kotlin 实现委托属性的第一个例子||
| Delegate4 |Kotlin 实现委托属性的第二个例子||

### 5.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Lazy |使用 by lazy 的例子||


## Chapter 6
### 6.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Generic1 |Java 可以使用匿名内部类的方式可以获取到泛型参数的类型||
| Generic1 |Kotlin 版本的代码同样适用此方法||
| Generic2 |Java 利用反射获取运行时泛型参数的类型，子类可以获取父类泛型的具体类型||
| Generic2 |Kotlin 版本的代码同样适用此方法||


### 6.2 section 2
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Covariance |协变的例子||
| Contravariance |逆变的例子||


### 6.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Upper |上界约束的例子||
| TypeProjections |类型投影的例子||
| StarProjections |星号投影的例子||


## Chapter 7
### 7.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| KFunctionN1 |使用方法引用获得 KFunction 实例||
| KFunctionN2 |使用 KFunctionN 来引用类的扩展函数||
| KProperty |使用::属性来获取不可变属性的引用||
| KMutableProperty |使用::属性来获取可变属性的引用||
| ExtensionProperty |使用类名::属性来获取扩展属性的引用||
| ClassProperty |使用类名::属性来获取成员属性的引用||


## Chapter 8
### 8.2 section 2
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Receiver1 |带接收者的函数类型的例子||
| Receiver2 |apply 函数使用的例子||
| DSL1 |创建一个自己的 DSL||
| DSL2 |对 String 添加一个扩展函数invoke，并结合带接收者的 Lambda 作为参数||
| DSL3 |定义一个 Dependency 类用于模拟 Gradle 添加库的依赖||
| Assertion |使用中缀表达式实现 DSL||
| AssertionTest |Assertion 的单元测试||


## Chapter 9
### 9.1 section 1
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| InvokeClass |如果重载了调用操作符，那么在调用这个函数时可以省略 invoke 函数名||

### 9.2 section 2
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| Infix1 |在扩展函数中使用中缀表达式||
| Infix2 |在成员函数中使用中缀表达式||


### 9.3 section 3
| 类名      |      用途    |  备注 |
|----------|-------------|------|
| apply/Test |apply 函数使用的例子||
| run/Test |run 函数使用的例子||
| also/Test |also 函数使用的例子||
| notNull |判断两个对象、多个对象是否为空||


## Chapter 10
https://github.com/KilleTom/Android_IOS_KN


## Chapter 11
### 11.1 section 1


## Chapter 15

### 15.5 section 5
https://github.com/KilleTom/room

### 15.6 section 6
https://github.com/KilleTom/JetPackProject


## Chapter 16

### 16.1 section 1
https://github.com/fengzhizi715/SAF-Kotlin-log

### 16.2 section 2
https://github.com/fengzhizi715/NetDiagnose

### 16.3 section 3
https://github.com/fengzhizi715/AndroidServer

### 16.4 section 4
https://github.com/fengzhizi715/EventBus


## Chapter 17

### 17.1 section 1
https://github.com/KilleTom/RxTask

### 17.2 section 2
https://github.com/fengzhizi715/KStateMachine

### 17.3 section 3
公司的内部项目无法开源，抱歉


## Chapter 18

### 18.1 section 1
https://github.com/fengzhizi715/RxCache

### 18.3 section 3
https://github.com/fengzhizi715/NetDiscovery

### 18.4 section 4
公司的内部项目无法开源，抱歉

### 18.5 section 5
公司的内部项目无法开源，抱歉


# 开发工具

Java 的工程采用 Intellij IDEA 2021.3 社区版开发，，gradle 版本使用 6.7（绝大多数工程使用它）

Android 的工程采用 Android Studio Arctic Fox，gradle 版本在 6.1.1 以上

Kotlin 版本 1.5.31


# 联系方式:
wechat：fengzhizi715

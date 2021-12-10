package chapter6.section1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @FileName: chapter6.section1.Generic1
 * @author: Tony Shen
 * @date: 2021/12/10 1:41 PM
 * @version: V1.0 <描述当前版本功能>
 */
public class Generic1 {

    static class InnerClass<T> {

    }

    public static void main(String[] args) {

        InnerClass<Integer> innerClass = new InnerClass<Integer>(){

        }; // 匿名内部类的声明在编译时进行，实例化在运行时进行

        Type typeClass = innerClass.getClass().getGenericSuperclass();
        System.out.println(typeClass);

        if (typeClass instanceof ParameterizedType) {
            Type actualType = ((ParameterizedType)typeClass).getActualTypeArguments()[0];

            System.out.println(actualType);
        }
    }
}
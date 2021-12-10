package chapter6.section1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @FileName: chapter6.section1.Generic2
 * @author: Tony Shen
 * @date: 2021/12/10 1:43 PM
 * @version: V1.0 <描述当前版本功能>
 */
public class Generic2 {

    public static void main(String[] args) {

        GenericChild child = new GenericChild();
        child.printType();
    }
}

class Father<T> {}

class GenericChild extends Father<String>{

    public void printType() {

        Type genType = getClass().getGenericSuperclass();
        System.out.println(genType);
        Type params = ((ParameterizedType) genType).getActualTypeArguments()[0];
        System.out.println(params);
    }
}

package chapter5.section1.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @FileName: chapter5.section1.dynamic.DynamicProxyDemo
 * @author: Tony Shen
 * @date: 2021/12/9 1:21 PM
 * @version: V1.0 <描述当前版本功能>
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {

        BaseImpl baseImpl = new BaseImpl(10);                    // 创建委托对象
        ProxyHandler handler = new ProxyHandler(baseImpl);       // 创建调用处理器对象
        Base proxy = (Base) Proxy.newProxyInstance(BaseImpl.class.getClassLoader(),
                BaseImpl.class.getInterfaces(), handler);        // 动态生成代理对象
        proxy.print();                                           // 通过代理对象调用方法
    }
}

interface Base{
    void print();
}

/**
 * 委托类
 */
class BaseImpl implements Base{

    private int x;

    public BaseImpl(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println(x);
    }
}

/**
 * 代理类的调用处理器
 */
class ProxyHandler implements InvocationHandler {

    private Base b;

    public ProxyHandler(Base base){
        this.b = base;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        return method.invoke(b, args);
    }
}


package chapter5.section1;

/**
 * @FileName: chapter5.section1.ProxyDemo
 * @author: Tony Shen
 * @date: 2021/12/9 1:16 PM
 * @version: V1.0 <描述当前版本功能>
 */
public class ProxyDemo {

    public static void main(String args[]){

        BaseImpl impl = new BaseImpl(10);
        Proxy p = new Proxy(impl);
        p.print();
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

class Proxy implements Base{

    private Base b;

    public Proxy(Base base){
        this.b = base;
    }
    public void print(){

        b.print();
    }
}
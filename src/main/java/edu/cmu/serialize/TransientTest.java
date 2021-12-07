package edu.cmu.serialize;

import java.io.Serializable;

/**
 * @ClassName: TransientTest
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/6 10:56 上午
 * @Version 1.0
 */
public class TransientTest {
//    What is the value of name after an instance of Eagle is serialized and then deserialized?
// null -> 反序列化不会调用构造函数
}

class Bird implements Serializable {
    protected transient String name = "Bridget";
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Bird() {
        this.name = "Matt";
    }
}

class Eagle extends Bird implements Serializable {

    public Eagle() {
        this.name = "Daniel";
    }
}
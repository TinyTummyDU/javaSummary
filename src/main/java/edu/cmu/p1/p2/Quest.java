package edu.cmu.p1.p2;

/**
 * @ClassName: Quest
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/6 11:09 上午
 * @Version 1.0
 */
public class Quest {

    //tmd 初始化顺序问题， 我日了
    private int j = 10;
    private int i = giveMeJ();

    private int giveMeJ() {
        return j;
    }
    public static void main(String args[]) {
        System.out.println((new Quest()).i);
    }
}
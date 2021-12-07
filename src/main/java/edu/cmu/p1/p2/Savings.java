package edu.cmu.p1.p2;
import edu.cmu.p1.Account;
/**
 * @ClassName: Savings
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/6 11:06 上午
 * @Version 1.0
 */

public class Savings extends Account {
    private double interest;
    Account acct = new Account();
    //tmd : p1下的p2包 都不算同一个包，默认访问权限访问不到： balance 或者 acct.balance
//    public double getBalance (){ return (interest + acct.balance); }
}

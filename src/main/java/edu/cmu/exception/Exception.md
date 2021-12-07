## 0 is divisor

**那么在Java程序中一旦出现除数为0时，会出现什么情况呢：**

对于除数a和被除数b (a=0)，

(1)如果二者均为int型(long也是int型)，结果会抛出异常：java.lang.ArithmeticException: / by zero

(2)如果其中有一个为double或者float型，结果则是Infinity

 

**另外，对于Double和Float的NaN/Infinity等是否相等呢：**

Float.NaN == Double.NaN false

Float.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY true

Float.POSITIVE_INFINITY == Double.POSITIVE_INFINITY true
# Java 面向对象进阶知识点总结

---

## 1. `static` 关键字与工具类

### 1.1 静态变量（修饰成员变量）
* **概念与特点**：用 `static` 修饰的成员变量称为**静态变量**。
  * **共享性**：被该类所有的对象所共享，属于类本身，不属于某个单体对象。
  * **生命周期**：随着类的加载而加载，优先于对象的创建而存在。
* **调用方式**：
  * **类名调用（推荐）**：`类名.静态变量`（如 `Student.teacherName`）。
  * **对象名调用（不推荐）**：`对象名.静态变量`（如 `s1.teacherName`）。由于静态变量是共享的，通过任意对象修改静态变量，所有对象的该变量值都会随之改变。

#### 代码示例 (`Student` 类与共享变量)
```java
// Student.java
public class Student {
    String name;
    int age;
    static String teacherName; // 静态变量，全类共享

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Teacher: " + teacherName);
    }
}

// Test.java
public class Test {
    public static void main(String[] args) {
        Student.teacherName = "王老师"; // 推荐：通过类名赋值
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);

        // s1 和 s2 共享同一个 teacherName
        s1.show(); // Teacher: 王老师
        s2.show(); // Teacher: 王老师

        s1.teacherName = "李老师"; // 不推荐：通过对象名修改
        System.out.println(s2.teacherName); // 输出：李老师 (s2 共享的属性也同步修改)
    }
}
```

### 1.2 静态方法与工具类 (Utility Class)

在 Java 开发中，常见的类分类及其职责如下：

| 类类型 | 职责描述 | 特征与设计规范 |
| :--- | :--- | :--- |
| **Javabean 类** | 描述一类事物 | 包含私有属性、Getter/Setter、无参及全参构造方法 |
| **测试类** | 程序运行的主逻辑入口 | 包含 `main` 方法 |
| **工具类** | 提供通用辅助功能的类 | 帮我们完成某些通用操作（如数组处理、字符串操作、数学计算等） |

#### 工具类设计三大规范：
1. **私有化构造方法**（`private ClassName(){}`）：工具类只需暴露静态接口供外部直接使用，无需创建实例对象。私有构造防止外部手动 `new` 创建对象。
2. **方法全部用 `static` 修饰**：使用者无需实例化，直接通过 `类名.方法名()` 方式调用。
3. **避免包含非静态状态**：工具类通常不维护对象成员状态。

#### 工具类代码示例 (`ArrUtil`)
```java
package arraydemo;

public class ArrUtil {
    // 1. 私有化构造方法，阻止外部实例化
    private ArrUtil() {
    }

    // 2. 静态方法：打印数组
    public static String printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    // 3. 静态方法：计算数组平均值
    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
```

---

### 1.3 `static` 的访问规则与注意事项

#### 1. 访问权限对照表
核心口诀：**静态只能调用静态，非静态可以调用所有**。

| 调用发起方 | 访问静态变量 / 静态方法 | 访问非静态变量 / 非静态方法 | 核心原理解析 |
| :--- | :--- | :--- | :--- |
| **静态方法 (`static`)** | ✅ **允许** | ❌ **禁止** | 静态优先于对象存在。调用静态方法时可能压根还没有创建任何对象实例，因此找不到非静态成员。 |
| **非静态方法** | ✅ **允许** | ✅ **允许** | 非静态方法必须由具体的对象调用，此时对象必然存在，因此既能访问对象自身的属性，也能访问类共享的静态属性。 |

#### 2. `this` 关键字限制
* **静态方法中没有 `this` 关键字**。
* **原因**：`this` 代表当前方法调用者对象的内存地址。而静态方法属于类本身，可以直接通过类名调用，调用时可能没有对象存在，因而无法使用 `this`。

#### 3. 典型错误对比代码
```java
public class Student {
    String a;          // 非静态成员变量
    static String b;   // 静态成员变量

    public void showA() {}          // 非静态成员方法
    public static void methodA() {} // 静态成员方法

    public static void methodB() {
        // System.out.println(a); // ❌ 编译报错！静态方法无法直接访问非静态变量 a
        // showA();               // ❌ 编译报错！静态方法无法直接调用非静态方法 showA()

        System.out.println(b);    //  正确！静态方法可以访问静态变量 b
        methodA();                //  正确！静态方法可以调用静态方法 methodA()
    }
}
```

---

## 2. `final` 关键字

`final` 关键字表示“最终的、不可改变的”，可以用于修饰变量、类和方法。

### 2.1 修饰对象与作用

| 修饰对象 | 作用与效果 |
| :--- | :--- |
| **修饰类** | 表明该类为最终类，**不能被继承**。 |
| **修饰方法** | 表明该方法为最终方法，**不能被子类重写**。 |
| **修饰变量** | 表明该变量为**常量**，只能被赋值一次，一旦赋值后**数值或引用不可更改**。 |

### 2.2 常量命名规范
* 常量名所有字母统一**大写**。
* 如果由多个单词组成，单词之间用**下划线 `_`** 隔开（例如 `MAX_VALUE`、`PI`）。

---

### 2.3 基本类型 vs 引用类型中的 `final` 细节（重点）

`final` 修饰变量的核心本质是：**该变量中记录的内容/数值绝对不可改变**。

| 数据类型 | 变量中保存的内容 | `final` 约束效果 | 示例与行为对比 |
| :--- | :--- | :--- | :--- |
| **基本数据类型**<br>`byte`, `short`, `int`, `long`<br>`float`, `double`, `char`, `boolean` | **真实的具体数值** | 存储的**数值**无法更改 | `final int a = 10;`<br>`a = 20;` ❌ *(编译报错！)* |
| **引用数据类型**<br>数组、自定义类对象（`Student`, `Circle` 等） | **堆内存地址值** | **内存地址**无法更改，但**对象内部的属性值依然可以修改** | `final Student stu = new Student();`<br>`stu = new Student();` ❌ *(报地址变更错)*<br>`stu.setName("李四");`  *(允许修改属性)* |

#### 代码示例 (`Circle` 类)
```java
package finaldemo;

public class Circle {
    private double radius;
    private final double PI = 3.14; // 常量，赋值后不可修改

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }
}
```

---

## 3. 枚举 (`enum`)

### 3.1 什么是枚举？
枚举是一种特殊的 Javabean 类，用于表示**对象个数固定且有限**的集合（例如订单状态、星期、季节、支付方式等）。

---

### 3.2 枚举的核心语法与底层机制
1. **枚举项即对象**：每一个枚举项都是该枚举类的实例对象，底层默认用 `public static final` 修饰（本质上是常量对象）。
2. **第一行必须是枚举项**：枚举类的第一行必须书写枚举项，多个枚举项之间用逗号 `,` 分隔，末尾以分号 `;` 结尾。
3. **构造方法私有化**：枚举类的构造方法必须使用 `private` 修饰（可显式书写或由编译器默认生成 `private` 构造），禁止外部通过 `new` 关键字创建本类对象。

---

### 3.3 编译器为枚举新增的内置方法

编译器会自动为每个枚举类生成以下两个常用静态方法：

| 方法签名 | 返回值 | 功能说明 | 代码使用示例 |
| :--- | :--- | :--- | :--- |
| **`values()`** | `T[]` (枚举数组) | 返回包含所有枚举项的数组，常用于遍历枚举对象列表 | `OrderState[] arr = OrderState.values();` |
| **`valueOf(String name)`** | `T` (枚举对象) | 根据给定的字符串查找并返回对应的枚举对象（**区分大小写**） | `OrderState s = OrderState.valueOf("SHIPPED");` |

---

### 3.4 示例代码：电商订单状态案例 (`OrderState`)

#### 1. 定义枚举类 (`OrderState.java`)
```java
package enumdemo;

public enum OrderState {
    // 1. 第一行为固定枚举项（电商项目的 6 种订单状态）
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    private final String name; // 状态描述名称

    // 2. 构造器必须是私有的 (private)
    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

#### 2. 枚举的使用与内置方法测试 (`Test.java`)
```java
package enumdemo;

public class Test {
    public static void main(String[] args) {
        // 1. 获取枚举对象：通过 类名.枚举项 获取
        OrderState o1 = OrderState.SHIPPED;

        // 2. 结合 switch 语句进行分支处理 (现代 -> 语法)
        switch (o1) {
            case PAYMENT_PENDING -> System.out.println("订单状态是：待支付");
            case PROCESSING      -> System.out.println("订单状态是：处理中");
            case SHIPPED         -> System.out.println("订单状态是：已发货");
            case OUT_FOR_DELIVERY -> System.out.println("订单状态是：配送中");
            case DELIVERED       -> System.out.println("订单状态是：已送达");
            case CANCELLED       -> System.out.println("订单状态是：已取消");
        }

        // 3. values() 方法演示：获取所有枚举项并遍历
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 4. valueOf() 方法演示：根据字符串转为对应的枚举对象 (需区分大小写)
        OrderState shipped = OrderState.valueOf("SHIPPED");
        System.out.println("转换成功的枚举对象：" + shipped);
    }
}
```

---

## 4. 本章练习源码索引

在 `03-OOP-Advanced/src` 目录下对应的练习代码：

| 包名 | 代码文件 | 知识点演练 |
| :--- | :--- | :--- |
| **`staticdemo`** | [`Student.java`](./src/staticdemo/Student.java), [`Test.java`](./src/staticdemo/Test.java) | `static` 静态成员变量共享机制与类名/对象名调用演练 |
| **`arraydemo`** | [`ArrUtil.java`](./src/arraydemo/ArrUtil.java), [`Test.java`](./src/arraydemo/Test.java) | 数组工具类编写规范（私有构造 + 静态方法） |
| **`finaldemo`** | [`Circle.java`](./src/finaldemo/Circle.java), [`Test.java`](./src/finaldemo/Test.java) | `final` 关键字修饰常量 `PI` 与圆周长/面积计算 |
| **`enumdemo`** | [`OrderState.java`](./src/enumdemo/OrderState.java), [`Test.java`](./src/enumdemo/Test.java) | 订单状态枚举定义、`switch` 状态匹配及 `values()` / `valueOf()` 内置方法 |

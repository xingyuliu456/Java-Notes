# Java 面向对象初阶知识点总结

## 1. 面向对象概述

* **对象 (Object)**：把相关的数据和方法组织为一个整体来看待。
* **面向对象 (OOP)**：利用对象进行软件开发。
* **Javabean 类**：描述一个事物的类。
    * **实例化**：在 `main` 函数中实例化类。
    * **组成**：Javabean 类可以包含属性（成员变量）和行为（成员方法）。

---

## 2. 封装与 `private` 关键字

### 2.1 封装
* **概念**：私有化成员变量，然后对外提供 `public` 的 `get` 和 `set` 方法。

### 2.2 `private` 关键字
* **作用**：修饰成员变量或者方法。
* **权限**：只能在本类中访问。

### 2.3 代码示例 (`Dog` 类)

```java
public class Dog {
    private String name;
    private int age;

    public void eating() {
        System.out.println("小狗正在吃东西");
    }

    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    public void setAge(int value) {
        if (value >= 0 && value <= 15) {
            age = value;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }
}
```

---

## 3. `this` 关键字与底层原理

### 3.1 就近原则
* 在同一作用域内，如果成员变量和局部变量同名，默认遵循**就近原则**（优先找局部变量，局部变量不存在才会去找成员变量）。

### 3.2 `this` 的本质
* **本质**：`this` 代表当前**方法调用者自身的内存地址**。
* **作用**：当局部变量与成员变量同名时，使用 `this.变量名`（如 `this.age`）可以精准指定访问成员变量，避免被局部变量覆盖遮蔽。

### 3.3 原理代码示例与分析

#### 代码示例

```java
// Memory.java
public class Memory {
    public static void main(String[] args) {
        Student s1 = new Student("小诗诗", 18);
        Student s2 = new Student("小丹丹", 19);
        s1.study();
        s2.study();
    }
}

// Student.java
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        int age = 10; // 局部变量
        System.out.println("局部变量~" + age);
        System.out.println(this.age + "正在学习~");
    }
}
```

#### 为什么 `this.age` 可以精准找到成员变量？
* **内存地址绑定**：当执行 `s1.study()` 调用方法时，`this` 记录了方法调用者 `s1` 在堆内存中的真实地址，因此 `this.age` 等同于 `s1.age`（精确访问对象内部的成员变量 `18`）。
* **局部变量隔离**：而在 `study()` 方法内部单独写的 `age`，根据**就近原则**，优先访问的是定义在方法栈帧里的局部变量 `10`。

---

## 4. 构造方法 (Constructor)

构造方法包含**空参构造**和**带全部参数构造方法**。

### 4.1 特点
1. **方法名与类名相同**，大小写也必须保持一致。
2. **没有返回值类型**，连 `void` 都没有。
3. **没有具体的返回值**（不能由 `return` 带回结果数据）。

### 4.2 执行时机
1. **创建对象时由虚拟机调用**，不能手动调用构造方法。
2. **每创建一次对象，就会调用一次构造方法**。

### 4.3 注意事项
* **默认机制**：系统会默认提供一个空参构造方法。
* **覆盖机制**：如果显式书写了任何构造函数，系统就不会自动生成默认的空参构造。
* **建议**：如果只写全参构造而不显式书写空参构造，会导致无法无参实例化（容易“炸缸”）。因此习惯上会**同时手写空参构造和全参构造**。

---

## 5. 面向对象底层原理与内存机制

### 5.1 创建对象 (`Student stu = new Student();`) 的七大步骤

以 `Student stu = new Student();` 为例，在 JVM 底层实例化一个对象包含以下 7 个核心步骤：

1. **加载字节码文件**：JVM 将 `Student.class` 字节码文件加载进方法区。
2. **声明局部变量**：在栈内存（Stack）中为等号左边的局部变量 `stu` 开辟空间。
3. **开辟堆内存空间**：在堆内存（Heap）中为新创建的对象开辟一块独立的内存空间。
4. **默认初始化**：给对象中的属性进行默认初始化（例如：数值类型赋默认值 `0` / `0.0`，引用类型赋 `null`，布尔型赋 `false` 等）。
5. **显式初始化**：给对象中的属性进行显式初始化（如声明属性时有显式初始值 `int a = 1;`，在此步赋值）。
6. **构造方法初始化**：利用构造方法对对象属性进行针对性的初始化赋值。
7. **内存地址赋值**：将堆内存中对象的内存地址赋值给栈内存中等号左边的局部变量 `stu`。

### 5.2 内存与生命周期管理规则

1. **局部变量生命周期**：方法执行完毕出栈后，方法内部的局部变量全部销毁消失。
2. **对象垃圾回收 (GC)**：如果没有任何变量使用/引用堆里面的对象，该对象沦为垃圾，随后会从堆内存中消失（由垃圾回收器 GC 进行清理）。
3. **字节码驻留机制**：方法区中的字节码信息一般不会回收消失，除非关闭虚拟机 (JVM)。

---

## 6. IDEA 快捷键

* **快捷键**：`Alt + Insert`
* **功能**：可自动生成构造函数（Constructor）以及 Getter and Setter，并可选择是否囊括所有成员变量。
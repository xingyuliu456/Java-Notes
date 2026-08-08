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

## 3. `this` 关键字与作用域

### 3.1 就近原则
* 在同一作用域内，如果成员变量和局部变量同名，默认遵循**就近原则**（先找局部变量，找不到再找成员变量）。

### 3.2 `this` 关键字
* 如果想直接访问成员变量，需要使用 `this.变量名`（例如 `this.age`）。

### 3.3 代码示例 (`Student` 类)

```java
public class Student {
    private int age;

    // set(赋值)
    public void setAge(int age) {
        this.age = age;
        System.out.println(this.age); // 使用成员变量
    }

    // get(获取)
    public int getAge() {
        return age; // 触发就近原则
    }
}
```

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

## 5. IDEA 快捷键

* **快捷键**：`Alt + Insert`
* **功能**：可自动生成构造函数（Constructor）以及 Getter and Setter，并可选择是否囊括所有成员变量。
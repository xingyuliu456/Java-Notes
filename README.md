# Java 学习笔记 (Java-Notes)

本仓库用于记录 Java 编程学习过程中的重点笔记、知识点梳理以及配套的示例代码与练习。

每个章节目录下均包含该章节的**详细笔记（README.md）**以及对应的 **Java 源码（src/）**。

---

## 📁 目录结构

```text
Java-Notes/
├── 01-HelloWorld/             # 第一章：Java 基础语法与核心机制
│   ├── src/                   # 示例代码（基础语法、逻辑控制、数组、方法等）
│   └── README.md              # 第一章详细知识点笔记
├── 02-OOP/                    # 第二章：面向对象编程 (OOP) 初阶
│   ├── src/                   # 示例代码（封装、构造方法、Javabean、对象数组等）
│   └── README.md              # 第二章详细知识点笔记
├── 03-OOP-Advanced/           # 第三章：面向对象编程 (OOP) 进阶
│   ├── src/                   # 示例代码（static、工具类规范、final、枚举 enum 等）
│   └── README.md              # 第三章详细知识点笔记
├── 04-OOP-Extends/            # 第四章：面向对象编程 (OOP) 高级——继承
│   ├── src/                   # 示例代码（继承设计、方法重写、构造机制、虚方法表原理、多层继承实战等）
│   └── README.md              # 第四章详细知识点笔记
└── README.md                  # 项目总览文档（当前文件）
```

---

## 📚 章节内容概览

| 章节 | 目录名 | 主要内容说明 | 详细笔记 |
| :--- | :--- | :--- | :--- |
| **第一章** | [`01-HelloWorld`](./01-HelloWorld) | Java 基础语法、输入输出 (`Scanner`)、数组操作、方法定义与重载、核心运行机制与内存图解等。 | [查看第一章笔记](./01-HelloWorld/README.md) |
| **第二章** | [`02-OOP`](./02-OOP) | 面向对象核心思想、封装性与 `private`、构造方法、`this` 的内存本质、对象创建 7 步与 GC/底层内存机制。 | [查看第二章笔记](./02-OOP/README.md) |
| **第三章** | [`03-OOP-Advanced`](./03-OOP-Advanced) | 面向对象进阶：`static` 静态变量/静态方法、工具类设计规范、`final` 关键字与内存机制、枚举 `enum` 及内置方法等。 | [查看第三章笔记](./03-OOP-Advanced/README.md) |
| **第四章** | [`04-OOP-Extends`](./04-OOP-Extends) | 面向对象高级：继承 (`extends`)、方法重写与 `@Override`、构造方法与 `this/super` 汇总、虚方法表底层原理与权限修饰符等。 | [查看第四章笔记](./04-OOP-Extends/README.md) |

---

## 💻 开发与运行环境

- **语言环境**: Java (建议 JDK 11 / JDK 17 及以上)
- **开发工具**: IntelliJ IDEA
- **使用方式**: 可以在 IDE 中导入各章节模块运行示例代码，也可点击对应章节目录下的 `README.md` 查看详细笔记。

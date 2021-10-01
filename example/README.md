# W03

## 191220079 马润泽

#### 1. 对代码工作原理的理解

​		在Scene.java的主函数中我们通过定义Classloader的子类SteganographyClassLoader来从隐写术图中加载类。Classloader通过findClass来寻找我们要求的类，而SteganographyClassLoader重写了这一函数。该函数通过给出的图片URL读取图片，并调用提供的解码函数从隐写术图中得到隐藏的类的字节码。将这些字节码定义为类进行加载并创建实例，就得到了隐藏在隐写术图中排序类的实例。

#### 2. 图片URL

本机使用绝对路径：

快速排序：file:///C:/Users/14336/Desktop/jwork/jw03-Mars-Z777/example.QuickSorter.png

选择排序：file:///C:/Users/14336/Desktop/jwork/jw03-Mars-Z777/example.QuickSorter.png

另提供来自聚合图床的URL(本机测试有效)：

快速排序：https://pic.imgdb.cn/item/61558adf2ab3f51d91be61cc.png

选择排序：https://pic.imgdb.cn/item/61558b272ab3f51d91bec5ee.png

#### 3. 动画链接

快速排序：

[![asciicast](https://asciinema.org/a/438967.svg)](https://asciinema.org/a/438967)

选择排序：

[![asciicast](https://asciinema.org/a/438968.svg)](https://asciinema.org/a/438968)

#### 4. 引用他人图片
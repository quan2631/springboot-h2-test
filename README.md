# springboot-h2-test

## 背景说明
``` 
本工程作为初步接触H2的demo工程，仅供学习交流。
H2Test类，是作为一个main方法级别的示例；其他代码是一个web工程示例。
```
## H2简介
``` 
用java开发的嵌入式数据库，是一个jar包，可以轻松的放入到项目；
方便的存储少量结构化的数据；
提供了一个控制台，方便操作；
功能完整，支持标准的SQL和JDBC；
支持内嵌模式、服务器模式和集群模式。
```
## 关于spring.datasource.url的说明
``` 
(1)内存数据库
jdbc:h2:mem:DBName
内存数据库的数据存在内存中，当程序停止时，不会被保存会丢失
eg：spring.datasource.url=jdbc:h2:mem:test

(2)本地文件数据库
jdbc:h2:file:{FilePath} 也可以简化为 jdbc:h2:{FilePath}
FilePath的格式
a)  ./{path}/{fileName} 在当前程序的根目录下创建目录和数据库文件
b)  ~/{path}/{fileName} 在当前用户的根目录下创建目录和数据库文件
c)  C:/{path}/{fileName} 在指定盘符的指定目录下创建数据库文件
说明：也叫嵌入式本地连接方式；
默认情况下只允许有一个客户端连接到H2数据库，有客户端连接到H2数据库之后，此时
数据库文件就会被锁定，那么其他客户端就无法再连接了。

(3)远程数据库（推荐）
jdbc:h2:tcp://<{IP|hostname}>[:{Port}]/[]<{dbName}>
说明：基于Service的形式进行连接的，因此允许多个客户端同时连接到H2数据库；
暴雨哥的方式是：启动一个工程（含一个H2服务）作为H2数据库的服务端，其他程序作为客户端、与使用别的数据库一样使用。
```
## 达到了什么效果
启动项目后，查看数据：http://localhost:8080/find
``` 
返回：[{"id":1,"name":"abc"},{"id":2,"name":"zyx"}]
```
启动项目后，查看数据库：http://localhost:8080/h2-console/
``` 
执行select * from user，返回略。
```
## 参考
```
https://blog.csdn.net/aituochang1886/article/details/101167451
https://www.jianshu.com/p/3663ef3fc93d
```

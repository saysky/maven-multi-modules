# maven-multi-modules
基于 Maven 多模块实现 SpringBoot 和 MyBatis 整合、RestFul URL 设计

## 如何使用
1、新建数据库 summer、导入数据库文件 summer.sql  <br/>
2、使用 IntelliJ IDEA 导入 Maven 项目，项目名任意 <br/>
3、修改数据库连接信息，在 summmer-dao 里 <br/>
4、控制器在 msummer-web 中，项目启动类也在此 <br/>
5、启动项目，浏览器访问 localhost:8080/user 等url <br/>

## 说明
1、关于使用 mybatis-generator 自动生成实体和 mapper  <br/>
在 summer-dao 中的 util 包内，运行 GeneratorSqlmap 类，其中 generatorConfig.xml ，我这里是放在项目根目录，当然你也可以使用物理路径 <br/>

2、如何打包部署  <br/>
在 IDEA 中，打开右边 Maven 工具侧边栏，在 summer(root) 里依次点击 clean 和 package，然后在 summer-dao,summer-service,summer-web 的 
target 文件里有对应的 jar，分别拷贝 summer-dao-exec.jar、summer-service-exec.jar、summer-web.jar 到某个目录，然后解压合并即可运行。<br/>
命令 `nohup java org.springframework.boot.loader.JarLauncher >output.txt &`

## 补充
1、application.properties 在 summer-web 中，只需要一份，不要在 summer-dao 中新建 <br/>
2、如果出现无法注入，可以在启动类上添加 `@ComponentScan({"com.liuyanzhao.summer"})`

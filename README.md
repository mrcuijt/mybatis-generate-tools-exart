#### 1. 项目配置

将 release jar 放在 maven 项目根目录下的 libs 目录中

#### 2. POM 配置

pom.xml 插件配置

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.7</version>
                <configuration>
                    <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>
                    <overwrite>true</overwrite>
                    <verbose>true</verbose>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>com.h2database</groupId>
                        <artifactId>h2</artifactId>
                        <version>2.2.224</version>
                    </dependency>
                    <dependency>
                        <groupId>com.github.noraui</groupId>
                        <artifactId>ojdbc8</artifactId>
                        <version>12.2.0.1</version>
                    </dependency>
                    <dependency>
                        <groupId>javax.frame.tools</groupId>
                        <artifactId>mybatis-generate-tools-exart</artifactId>
                        <version>1.0-SNAPSHOT</version>
                        <scope>system</scope>
                        <!-- 绝对路径引用 -->
                        <systemPath>${basedir}/libs/mybatis-generate-tools-exart-1.0-SNAPSHOT.jar</systemPath>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
```

#### generatorConfig.xml 示例

generatorConfig.xml 配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <!-- 数据库驱动:选择你的本地硬盘上面的数据库驱动包-->
    <classPathEntry
            location="D:\tools\mybatis-generate-tools-exart\dependency\mybatis-3.5.4.jar"/>
    <context id="OracleTables" targetRuntime="MyBatis3">
        <!--覆盖生成XML文件-->
        <plugin type="org.mybatis.generator.plugins.UnmergeableXmlMappersPlugin" />
        <plugin type="javax.frame.tools.mybatis.util.LombokPlugin" />
        <!--<commentGenerator>
            <property name="suppressDate" value="true"/>
            &lt;!&ndash; 是否去除自动生成的注释 true：是 ： false:否 &ndash;&gt;
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>-->
        <!-- optional，旨在创建class时，对注释进行控制 -->
        <commentGenerator type="javax.frame.tools.mybatis.util.MybatisCommentGenerator">
            <!--<property name="suppressDate" value="true"/>-->
            <!--<property name="suppressAllComments" value="true" />-->
            <!-- 是否生成注释代时间戳-->
            <property name="suppressDate" value="true"/>
        </commentGenerator>

        <!--数据库链接URL，用户名、密码 -->
        <jdbcConnection driverClass="org.h2.Driver" connectionURL="jdbc:h2:tcp://127.0.0.1:3330/D:/tools/mybatis-generate-tools-exart/db/engine"
                        userId="sa" password="">
        </jdbcConnection>
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>
        <!-- 生成模型的包名和位置-->
        <javaModelGenerator targetPackage="javax.frame.tools.nginx.modules.log_parser.model" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"/>
            <property name="trimStrings" value="true"/>
            <!-- 是否对modal添加构造函数 -->
            <property name="constructorBased" value="false"/>
            <!-- 建立modal对象是否不可改变 即生成的modal对象不会有setter方法，只有构造方法 -->
            <property name="immutable" value="false"/>
        </javaModelGenerator>
        <!-- 生成映射文件的包名和位置-->
        <sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources">
            <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator>
        <!--  &lt;!&ndash; 生成DAO的包名和位置&ndash;&gt;-->
          <javaClientGenerator type="XMLMAPPER" targetPackage="javax.frame.tools.nginx.modules.log_parser.mapper" targetProject="src/main/java">
              <property name="enableSubPackages" value="true"/>
          </javaClientGenerator>
        <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->
        <table tableName="SYS_NGINX_LOG" enableCountByExample="false" enableUpdateByExample="false"
               enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>
    </context>
</generatorConfiguration>
```
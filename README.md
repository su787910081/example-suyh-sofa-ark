# example-suyh-sofa-ark

先将这4 个sdk 安装到本地仓库
```bash
mvn clean install -P conflict-v1,!app
mvn clean install -P conflict-v2,!app
mvn clean install -P hello,!app
mvn clean install -P hi,!app
```

然后就可以通过idea 进行调试或者java 命令进行运行了

## Build
```
% mvn clean package
```

## Deploy & Execute
warをデプロイして実行する。

```
% java -jar launcher-4.0.jar --deploy target/domo.war
```

Uber Jarを作って実行する。

```
% java -jar launcher-4.0.jar --deploy target/domo.war --generate target/uber-domo.jar
% java -jar target/uber-domo.jar
```

## 参考
https://github.com/fujitsu/launcher/blob/master/docs/Usage.adoc
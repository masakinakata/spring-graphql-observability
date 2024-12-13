# Spring for GraphQLに可観測性を持たせたサンプルアプリ

## 実行環境
- JDK: OpenJDK 17.0.13
- Spring Boot: 3.4.0
- Spring Framework: 6.2.0
- Spring for GraphQL: 1.3.3
- Docker: Docker 27.3.1

## 実行方法
### Spring Bootアプリのビルド
ルートディレクトリ
```
$ cd bookInfo
$ ./gradlew bootJar
```

### 実行
```
$ docker compose up -d
```

#### GraphQLサーバへのアクセス
`localhost:8080/graphiql`でGUIからリクエストを送ってレスポンスを確認できます

#### Zipkinへのアクセス
`localhost:9411`にアクセスするみZipkinへアクセスできます

### 終了
```
$ docker compose down
```
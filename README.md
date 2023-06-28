# Java_Sringboot
This is a repository containing documentation about Java Spring Boot.

<h3>Kết nối với MySQL</h3>
<h4>Để kết nối và làm việc với cơ sở dữ liệu SQL trong Java Spring Boot, bạn cần thực hiện các bước sau:</h4>

<h5>Thêm các phụ thuộc (dependencies) vào file pom.xml để sử dụng thư viện JDBC và thư viện cơ sở dữ liệu SQL mà bạn đang sử dụng. Ví dụ, nếu bạn đang sử dụng MySQL, bạn có thể thêm phụ thuộc sau:</h5>
```xml
<dependencies>
    <!-- Các phụ thuộc khác -->

    <!-- MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
</dependencies>
}
```


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
<h5>Đối với Gradle, bạn có thể thêm phụ thuộc vào file build.gradle để sử dụng thư viện JDBC và thư viện cơ sở dữ liệu SQL như sau:</h5>
```xml
dependencies {
    // Các phụ thuộc khác

    // MySQL
    implementation 'mysql:mysql-connector-java'
}
```

<h4>Cấu hình thông tin kết nối cơ sở dữ liệu trong file application.properties hoặc application.yml của Spring Boot. Ví dụ, đối với MySQL, bạn có thể thêm các thông tin sau:</h4>

```application.properties và  application.yml
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

<h4>Trong class Java Spring Boot của bạn, bạn có thể sử dụng các annotation như @Entity, @Table, @Column, và @Id để định nghĩa các đối tượng (entities) tương ứng với các bảng trong cơ sở dữ liệu. Đồng thời, sử dụng các interface như JpaRepository để thực hiện các hoạt động CRUD (Create, Read, Update, Delete) trên cơ sở dữ liệu.</h4>

```java
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    // Constructors, getters và setters

    // ...
}
```

<h4>Sử dụng repository để thao tác với cơ sở dữ liệu trong service hoặc controller của bạn. Ví dụ:</h4>

```java
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
```

<h4>Cuối cùng, bạn có thể sử dụng các service và controller để xử lý yêu cầu từ frontend và thực hiện các hoạt động tương ứng trên cơ sở dữ liệu.
Đây chỉ là một phần nhỏ trong quá trình kết nối cơ sở dữ liệu SQL trong Java Spring Boot. Bạn có thể tìm hiểu thêm về Spring Data JPA để biết chi tiết hơn về cách làm việc với cơ sở dữ liệu SQL trong Spring Boot.</h4>


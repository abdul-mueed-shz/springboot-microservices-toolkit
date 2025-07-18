# 🧰 Reusable Java Utility Toolkit for Microservices

A **modular Java toolkit** designed for Spring Boot microservices — built to share and reuse common components like:

- 🔐 JWT-based Security Filters & Config
- 🧱 Common DTOs (`UserDTO`, OAuth providers)
- 🧪 Utility classes and constants
- 📦 Ready to import as a library into any service

Use this toolkit across your microservices to keep code DRY, testable, and maintainable.

---

## 📦 Modules Included

### 🔐 `security-module`
- Full **JWT filter & validation**
- Spring Security configuration
- Utility for extracting claims, tokens, auth context

### 🧰 `common-utils`
- `UserDTO`: standardized user data format
- Date/time & string utilities
- Constants & enum definitions

### 🌐 `oauth-dtos`
- Standardized OAuth login DTOs for:
  - Google
  - GitHub
  - LinkedIn
  - X (formerly Twitter)

---

## 🧑‍💻 Designed For Reuse In

| Service | Description |
|--------|-------------|
| [`user-microservice`](https://github.com/abdul-mueed-shz/user-microservice) | User registration, profile, auth |
| [`payment-service`](https://github.com/abdul-mueed-shz/payment-service) | Stripe-powered payments, billing |
| Other microservices              | Any Spring Boot service needing shared logic |

---

## 🛠️ How to Use

### 📥 Import via Maven

You can include this toolkit using **JitPack** (if hosted on GitHub):

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.abdul-mueed-shz</groupId>
  <artifactId>java-util-toolkit</artifactId>
  <version>main-SNAPSHOT</version> <!-- or specific tag -->
</dependency>
```

## 🔐 JWT Security Example

This toolkit provides:
-	JwtAuthenticationFilter
-	JwtTokenProvider
-	SecurityConfig with path exclusions and filter chain setup

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
              .antMatchers("/auth/**").permitAll()
              .anyRequest().authenticated()
            .and()
              .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
```

## 🌐 OAuth DTOs Included (Samples)

```java
public class GoogleOAuthDTO {
    private String email;
    private String name;
    private String picture;
    private String idToken;
}

public class GitHubOAuthDTO {
    private String login;
    private String email;
    private String avatarUrl;
}

public class LinkedInOAuthDTO {
    private String emailAddress;
    private String fullName;
}

public class XOauthDTO {
    private String username;
    private String userId;
    private String accessToken;
}
```

## 🔄 Versioning & Packaging

```bash
git tag v1.0.0
git push origin v1.0.0
```

## ✅ Benefits

- 🔄 Eliminate duplication across services
-	🔐 Centralized security logic for consistent enforcement
-	🧩 Easily pluggable in any Spring Boot app
-	📦 Modularized for clean imports

## 🧪 Coming Soon

-	📊 Logging & tracing utilities
-	📥 Email or notification DTOs
-	🧪 Test support for mocking auth

## 🤝 Contributing

Want to contribute utilities, fixes, or new modules?
Feel free to open PRs or create an issue with suggestions.

## 📄 License

MIT License — free to use and modify.

“Code once, reuse everywhere. Let your microservices stay focused — we’ve got the common stuff covered.”


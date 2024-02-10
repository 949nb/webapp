package com.example.webapp.repository;
import com.example.webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 创建一个 UserRepository 接口，继承自 JpaRepository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 这里不需要手动实现 CRUD 操作，JpaRepository 已经提供了默认实现
    // 你可以添加自定义的查询方法，例如根据用户名查找用户
    User findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
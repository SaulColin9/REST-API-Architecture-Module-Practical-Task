package org.cloud.repository;

import org.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserRepository {
    User get(Long id);
    List<User> getAll();
    User save(User user);
    User update(User user);
    boolean delete(Long id);
}

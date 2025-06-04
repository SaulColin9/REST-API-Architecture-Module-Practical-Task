package org.cloud.repository.user;

import org.domain.User;

import java.util.List;

public interface UserRepository {
    User get(Long id);
    List<User> getAll();
    User save(User user);
    User update(User user);
    boolean delete(Long id);
}

package org.cloud.repository;

import org.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DefaultUserRepository implements UserRepository {
    final Map<Long, User> storage;

    public DefaultUserRepository(Map<Long, User> storage) {
        this.storage = storage;
    }

    @Override
    public User get(Long id) {
        return storage.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public User save(User user) {
        storage.put(user.getId(), user);
        return user;
    }

    @Override
    public User update(User user) {
        storage.put(user.getId(), user);
        return user;
    }

    @Override
    public boolean delete(Long id) {
        Optional<User> foundUser = Optional.ofNullable(storage.get(id));
        if(foundUser.isEmpty())
            return false;

        foundUser.ifPresent(storage::remove);
        return true;
    }
}

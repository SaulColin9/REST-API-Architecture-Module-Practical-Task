package org.cloud.repository.user;

import org.domain.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Primary
@Repository
public interface DbUserRepository extends JpaRepository<User, Long> {
}

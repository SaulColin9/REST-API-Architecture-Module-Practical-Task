package org.cloud.repository.subscription;

import org.domain.Subscription;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public interface DbSubscriptionRepository extends JpaRepository<Subscription, Long> {
}

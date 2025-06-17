package org.cloud.repository.subscription;

import org.domain.Subscription;

import java.util.List;

public interface SubscriptionRepository {
    Subscription get(Long id);
    List<Subscription> getAll();
    Subscription save(Subscription Subscription);
    Subscription update(Subscription Subscription);
    boolean delete(Long id);
}

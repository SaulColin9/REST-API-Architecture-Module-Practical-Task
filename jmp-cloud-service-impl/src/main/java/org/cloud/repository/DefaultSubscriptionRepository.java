package org.cloud.repository;

import org.domain.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DefaultSubscriptionRepository implements SubscriptionRepository{

    final Map<Long, Subscription> storage;

    public DefaultSubscriptionRepository(Map<Long, Subscription> storage) {
        this.storage = storage;
    }

    @Override
    public Subscription get(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Subscription> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Subscription save(Subscription Subscription) {
        return storage.put(Subscription.getId(), Subscription);
    }

    @Override
    public Subscription update(Subscription Subscription) {
        return storage.put(Subscription.getId(), Subscription);
    }

    @Override
    public boolean delete(Long id) {
        Optional<Subscription> foundSubscription = Optional.ofNullable(storage.get(id));
        if(foundSubscription.isEmpty())
            return false;

        foundSubscription.ifPresent(storage::remove);
        return true;
    }
}

package org.cloud.service;

import org.cloud.converter.SubscriptionRequestDtoToSubscriptionConverter;
import org.cloud.converter.SubscriptionToSubscriptionResponseDtoConverter;
import org.cloud.repository.subscription.SubscriptionRepository;
import org.domain.Subscription;
import org.dto.SubscriptionRequestDto;
import org.dto.SubscriptionResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private SubscriptionToSubscriptionResponseDtoConverter subscriptionResponseDtoConverter;
    @Autowired
    private SubscriptionRequestDtoToSubscriptionConverter requestDtoToSubscriptionConverter;


    @Override
    public SubscriptionResponseDto createSubscription(SubscriptionRequestDto dto) {
        Subscription subscription = subscriptionRepository.save(requestDtoToSubscriptionConverter.convert(dto));
        return subscriptionResponseDtoConverter.convert(subscription);
    }

    @Override
    public SubscriptionResponseDto updateSubscription(SubscriptionRequestDto dto) {
        Subscription subscription = subscriptionRepository.update(requestDtoToSubscriptionConverter.convert(dto));
        return subscriptionResponseDtoConverter.convert(subscription);
    }

    @Override
    public boolean deleteSubscription(Long id) {
        return subscriptionRepository.delete(id);
    }

    @Override
    public SubscriptionResponseDto getSubscription(Long id) {
        return subscriptionResponseDtoConverter.convert(subscriptionRepository.get(id));
    }

    @Override
    public List<SubscriptionResponseDto> getAllSubscription() {
        return subscriptionRepository.getAll().stream()
                .map(subscriptionResponseDtoConverter::convert)
                .toList();
    }
}

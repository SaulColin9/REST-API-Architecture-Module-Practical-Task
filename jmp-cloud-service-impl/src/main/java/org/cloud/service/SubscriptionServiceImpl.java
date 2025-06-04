package org.cloud.service;

import org.dto.SubscriptionRequestDto;
import org.dto.SubscriptionResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
    @Override
    public SubscriptionResponseDto createSubscription(SubscriptionRequestDto dto) {
        return null;
    }

    @Override
    public SubscriptionResponseDto updateSubscription(SubscriptionRequestDto dto) {
        return null;
    }

    @Override
    public boolean deleteSubscription(Long id) {
        return false;
    }

    @Override
    public SubscriptionResponseDto getSubscription(Long id) {
        return null;
    }

    @Override
    public List<SubscriptionResponseDto> getAllSubscription() {
        return List.of();
    }
}

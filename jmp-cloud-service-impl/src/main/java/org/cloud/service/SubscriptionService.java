package org.cloud.service;

import org.dto.SubscriptionRequestDto;
import org.dto.SubscriptionResponseDto;

import java.util.List;

public interface SubscriptionService {
    SubscriptionResponseDto createSubscription(SubscriptionRequestDto dto);
    SubscriptionResponseDto updateSubscription(SubscriptionRequestDto dto);
    boolean deleteSubscription(Long id);
    SubscriptionResponseDto getSubscription(Long id);
    List<SubscriptionResponseDto> getAllSubscription();
}

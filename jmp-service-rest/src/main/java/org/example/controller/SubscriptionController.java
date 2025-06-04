package org.example.controller;

import org.example.dto.SubscriptionRequestDto;
import org.example.dto.SubscriptionResponseDto;

import java.util.List;

public interface SubscriptionController {
    SubscriptionResponseDto createSubscription(SubscriptionRequestDto dto);
    SubscriptionResponseDto updateSubscription(SubscriptionRequestDto dto);
    boolean deleteSubscription(Long id);
    SubscriptionResponseDto getSubscription(Long id);
    List<SubscriptionResponseDto> getAllSubscription(SubscriptionRequestDto dto);
}

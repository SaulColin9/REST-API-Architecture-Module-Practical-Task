package org.cloud.converter;

import org.springframework.core.convert.converter.Converter;
import org.domain.Subscription;
import org.dto.SubscriptionResponseDto;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionToSubscriptionResponseDtoConverter implements Converter<Subscription, SubscriptionResponseDto> {

    @Override
    public SubscriptionResponseDto convert(Subscription subscription) {
        SubscriptionResponseDto dto = new SubscriptionResponseDto();
        dto.setId(subscription.getId());
        dto.setUserId(subscription.getUser().getId()); // Map User's ID
        dto.setStartDate(subscription.getStartDate().toString()); // Convert LocalDate to String
        return dto;
    }
}
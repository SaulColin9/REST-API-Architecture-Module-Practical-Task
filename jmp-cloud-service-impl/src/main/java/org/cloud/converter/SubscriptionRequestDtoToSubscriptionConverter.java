package org.cloud.converter;

import org.springframework.core.convert.converter.Converter;
import org.dto.SubscriptionRequestDto;
import org.domain.Subscription;
import org.domain.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SubscriptionRequestDtoToSubscriptionConverter implements Converter<SubscriptionRequestDto, Subscription> {

    @Override
    public Subscription convert(SubscriptionRequestDto dto) {
        Subscription subscription = new Subscription();
        subscription.setId(dto.getId());

        User user = new User();
        user.setId(dto.getUserId());
        subscription.setUser(user);

        subscription.setStartDate(LocalDate.now());
        return subscription;
    }
}
package org.cloud.controller;

import org.cloud.service.SubscriptionServiceImpl;
import org.dto.SubscriptionRequestDto;
import org.dto.SubscriptionResponseDto;
import org.rest.controller.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription")
public class SubscriptionControllerImpl implements SubscriptionController {
    @Autowired
    private SubscriptionServiceImpl SubscriptionService;

    @Override
    @PostMapping
    public SubscriptionResponseDto createSubscription(@RequestBody SubscriptionRequestDto dto) {
        return SubscriptionService.createSubscription(dto);
    }

    @Override
    @PutMapping
    public SubscriptionResponseDto updateSubscription(@RequestBody SubscriptionRequestDto dto) {
        return SubscriptionService.updateSubscription(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    public boolean deleteSubscription(@PathVariable Long id) {
        return SubscriptionService.deleteSubscription(id);
    }

    @Override
    @GetMapping("/{id}")
    public SubscriptionResponseDto getSubscription(@PathVariable Long id) {
        return SubscriptionService.getSubscription(id);
    }

    @Override
    @GetMapping
    public List<SubscriptionResponseDto> getAllSubscription() {
        return SubscriptionService.getAllSubscription();
    }
}

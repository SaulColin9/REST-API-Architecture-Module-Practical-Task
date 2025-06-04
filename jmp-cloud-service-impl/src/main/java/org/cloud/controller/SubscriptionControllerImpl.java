package org.cloud.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.cloud.service.SubscriptionService;
import org.cloud.service.SubscriptionServiceImpl;
import org.dto.SubscriptionRequestDto;
import org.dto.SubscriptionResponseDto;
import org.rest.controller.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/subscription")
@Tag(name = "Subscription API", description = "CRUD API for subcriptions")
public class SubscriptionControllerImpl implements SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a new subscription", description = "Adds a new subscription to storage")
    public SubscriptionResponseDto createSubscription(@RequestBody SubscriptionRequestDto dto) {
        SubscriptionResponseDto responseDto = subscriptionService.createSubscription(dto);
//        responseDto.add(linkTo(methodOn(SubscriptionControllerImpl.class).getSubscription(responseDto.getId())).withSelfRel());
        return responseDto;
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Update subscription", description = "Updates an existing subscription")
    public SubscriptionResponseDto updateSubscription(@RequestBody SubscriptionRequestDto dto) {
        return subscriptionService.updateSubscription(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete subscription", description = "Deletes an existing subscription")
    public boolean deleteSubscription(@PathVariable Long id) {
        return subscriptionService.deleteSubscription(id);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get subscription", description = "Retrieves an existing subscription")
    public SubscriptionResponseDto getSubscription(@PathVariable Long id) {
        return subscriptionService.getSubscription(id);
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get subscriptions", description = "Returns a list of all available subscriptions")
    public List<SubscriptionResponseDto> getAllSubscription() {
        return subscriptionService.getAllSubscription();
    }
}

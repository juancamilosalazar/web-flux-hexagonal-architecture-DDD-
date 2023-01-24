package com.example.reactive.reactive.application.rest;

import com.example.reactive.reactive.domain.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CustomerServiceInterface {

    Flux<Customer> findAll();

    Mono<Customer> findById(final String id);

    Mono<Customer> update (final Customer dto);

    Mono<Customer> create(final Customer dto);

    Mono<Customer> delete(final String id);
}

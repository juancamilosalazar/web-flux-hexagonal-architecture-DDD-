package com.example.reactive.reactive.domain.service;

import com.example.reactive.reactive.application.rest.CustomerServiceInterface;
import com.example.reactive.reactive.domain.model.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService implements CustomerServiceInterface {
    @Override
    public Flux<Customer> findAll() {
        return null;
    }

    @Override
    public Mono<Customer> findById(String id) {
        return Mono.just(new Customer("Carlos"));
    }

    @Override
    public Mono<Customer> update(Customer dto) {
        return null;
    }

    @Override
    public Mono<Customer> create(Customer dto) {
        return null;
    }

    @Override
    public Mono<Customer> delete(String id) {
        return null;
    }
}

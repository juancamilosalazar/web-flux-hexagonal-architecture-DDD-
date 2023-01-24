package com.example.reactive.reactive.application.rest;


import com.example.reactive.reactive.application.response.Response;
import com.example.reactive.reactive.application.response.ResponseEnum;
import com.example.reactive.reactive.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "customer", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class CustomerController {

    private final CustomerServiceInterface queryService;



    @Autowired
    public CustomerController(final CustomerServiceInterface queryService) {
        this.queryService = queryService;
    }

    @GetMapping(params = {"id"})
    public Mono<Response<Customer>> findById(@RequestParam("id") final String id) {

        Mono<ResponseEntity<Response<Customer>>> responseRequest = Mono.empty();
        Mono<Response<Customer>> customer = Mono.empty();
        //boolean validData =


        return queryService.findById(id).map(x-> {
            Response<Customer> customerResponse =new Response<>();
            customerResponse.setstate(ResponseEnum.EXITO);
            ArrayList<Customer> customers = new ArrayList<>();
            customers.add(x);
            customerResponse.setresult(customers);
            return customerResponse;
        });



/*

  Mono<Response<Customer>> responseMono = Mono.just(new Response<Customer>()).map(response -> {
            response.setresult(queryService.findById(id).concatWith(Flux.empty()));
            response.setmessageResponse(new ArrayList<>());
            response.setstate(ResponseEnum.EXITO);
            return response;
        });
        responseMono.subscribe(x-> x.getresult().subscribe(y->System.out.println(y.getName())));
        return responseRequest.just(new ResponseEntity<>(customer.doOnNext(dto -> dto.setresult(Flux.from(queryService.findById(id))))
                .onErrorResume(e ->{
                    System.out.println(e.getMessage());
                    return Mono.empty();
                }),HttpStatus.OK));

 */


    }


}

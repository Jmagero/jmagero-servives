package com.jmagero.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;
    @GetMapping  (path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        log.info("Check fraud history " + customerId);
        boolean isFraudulentCustomer =
                fraudCheckService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}", customerId);

         return  new FraudCheckResponse(isFraudulentCustomer);
    }

}

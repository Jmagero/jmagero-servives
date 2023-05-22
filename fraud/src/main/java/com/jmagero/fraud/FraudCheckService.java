package com.jmagero.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckRepository fraudCheckRepository;

    public boolean isFraudulentCustomer(Integer customerID){
        fraudCheckRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerID)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

}

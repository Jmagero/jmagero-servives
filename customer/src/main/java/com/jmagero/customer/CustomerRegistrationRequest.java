package com.jmagero.customer;

public record CustomerRegistrationRequest(
          String firstName,
         String lastName,
         String email) {
}

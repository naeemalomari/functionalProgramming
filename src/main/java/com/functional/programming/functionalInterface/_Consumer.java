package com.functional.programming.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer naeem = new Customer("Naeem", "962799025272");
        //  normal java function
        greetCustomer(naeem);
        //this is using functional interface
        greetCustomerConsumer.accept(naeem);

        greetCustomerConsumerV2.accept(naeem, false);
        greetCustomerConsumerV2.accept(naeem, true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
                    System.out.println("hello " + customer.customerName + " , thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));


    static void greetCustomer(Customer customer) {
        System.out.println("hello " + customer.customerName + " , thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("hello " + customer.customerName + " , thanks for registering phone number " + customer.customerPhoneNumber);

    static class Customer {

        private final String customerName;

        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}


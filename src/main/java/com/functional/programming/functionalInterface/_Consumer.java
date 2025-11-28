package com.functional.programming.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

//        Customer naeem = new Customer("Naeem", "962799025272");
//        //  normal java function
//        greetCustomer(naeem);
//        //this is using functional interface
//        greetCustomerConsumer.accept(naeem);
//
//        greetCustomerConsumerV2.accept(naeem, false);
//        greetCustomerConsumerV2.accept(naeem, true);

        warningSms.accept(5.45);
        warningSmsWithCurrency.accept(10.44, "JOD");
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

    static Consumer<Double> warningSms = deductedAmount
            -> System.out.println("Thank you for using bla bla we have deduct " + deductedAmount + " USD from your balance");


    static BiConsumer<Double, String> warningSmsWithCurrency = (deductedAmount, currency)
            -> System.out.println("Thank you for using bla bla we have deduct " + deductedAmount + " " + currency + " from your balance");

}


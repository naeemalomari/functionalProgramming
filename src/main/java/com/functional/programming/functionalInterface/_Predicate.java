package com.functional.programming.functionalInterface;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
//        System.out.println(isPhoneNumberValid("07000000000"));
//        System.out.println(isPhoneNumberValid("0700000000"));
//        System.out.println(isPhoneNumberValid("09453543400"));
//
//        System.out.println("----------------------------------");
//
//        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
//        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
//        System.out.println(isPhoneNumberValidPredicate.test("09453543400"));
//
//        System.out.println("----------------------------------");
//        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
//        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07453543400"));
//        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000003"));

        System.out.println(checkUserBlocked.test("962799025272"));
        System.out.println(checkUserBlocked.test("962799025262"));

        System.out.println(IpOrMobileNumberBlocked.test("10.10.10.30","962799025272"));
        System.out.println(IpOrMobileNumberBlocked.test("10.10.10.20","962799025262"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") & phoneNumber.length() == 11;
    }


    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidPredicate = phone -> phone.startsWith("07") && phone.length() == 11;


    static Predicate<String> checkUserBlocked = mobileNumber -> mobileNumber.equals("962799025272");

    static BiPredicate<String , String> IpOrMobileNumberBlocked = (Ip, MobileNumber) ->
            Ip.equals("10.10.10.30") || MobileNumber.equals("962799025272");

}

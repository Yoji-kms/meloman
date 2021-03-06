package ru.netology

fun main() {
    val currentPayment = 100
    val prevPaymentSum = 10_0001
    val musicLover = true

    val discount = discount(currentPayment, prevPaymentSum, musicLover)

    println("Current payment: $currentPayment")
    println("Discount: $discount")
    val currentPaymentWithDiscount = currentPayment - discount
    println("Current payment with discount: $currentPaymentWithDiscount")
}

fun discount(currentPayment: Int, prevPaymentSum: Int, musicLover: Boolean): Double {
    val discountPercent = 0.05
    val musicLoverDiscountPercent = 0.01

    val discount = when (prevPaymentSum) {
        in 0..1_000 -> 0.0
        in 1_001..10_000 -> 100.0
        else -> currentPayment * discountPercent
    }
    return if (musicLover) discount + (currentPayment - discount) * musicLoverDiscountPercent else discount
}
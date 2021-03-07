package com.example.objects.chap02;

import java.time.Duration;
import java.util.Objects;

public class Movie {

    private final String title;
    private final Duration runningTime;
    private final Money fee;
    private final DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee,
        DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        if (Objects.isNull(discountPolicy)) {
            return fee;
        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}

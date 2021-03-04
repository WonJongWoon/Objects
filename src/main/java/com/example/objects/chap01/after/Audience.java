package com.example.objects.chap01.after;

// 관람객
public class Audience {

    private Bag bag; // 관람객이 소지한 가방

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}

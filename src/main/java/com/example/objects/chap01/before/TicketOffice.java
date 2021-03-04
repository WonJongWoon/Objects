package com.example.objects.chap01.before;

import java.util.Arrays;
import java.util.List;

// 매표소
public class TicketOffice {
    private Long amount; // 티켓의 판매 금액
    private List<Ticket> tickets; // 판매하거나 교환해 줄 티켓들

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓을 판매하는 메서드 (편의를 위하여 첫 번째 위치의 티켓을 반환)
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    // 판매금액을 더하는 메서드
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 판매금액을 차감하는 메서드
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}

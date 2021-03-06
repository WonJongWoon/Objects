package com.example.objects.chap01.before;

import java.util.Objects;

// 가방
public class Bag {
    private Long amount; // 티켓을 구매할 현금
    private Invitation invitation; // 초대장(티켓과 교환)
    private Ticket ticket; // 티켓

    // 초대장 없이 현금만 보관하는 상태 강제하는 생성자
    public Bag(Long amount) {
        this(amount, null);
    }

    // 현금과 초대장을 함께 보관 상태 강제하는 생성자
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    // 초대장의 보유 여부 판단하는 메서드
    public boolean hasInvitation() {
        return !Objects.isNull(invitation);
    }

    // 티켓의 소유 여부 판단하는 메서드
    public boolean hasTicket() {
        return !Objects.isNull(ticket);
    }

    // 초대장을 티켓으로 교환해주는 메서드
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 현금을 차감시키는 메서드
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 현금을 더하는 메서드
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}

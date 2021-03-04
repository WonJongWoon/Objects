package com.example.objects.chap01.after;

// 소극장
public class Theater {
    private TicketSeller ticketSeller; // 판매원

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 더 이상 매표소에 접근하지 않는다.
    // 또한 판매원 내부의 매표소가 있다는 사실 조차 모른다. (캡슐화)
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}

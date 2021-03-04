package com.example.objects.chap01.after;

// 판매원
public class TicketSeller {

    private TicketOffice ticketOffice; // 판매원이 일하는 매표소, 내부에서만 접근 가능(캡슐화)

    // 판매원이 일하는 매표소 강제하는 생성자
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}

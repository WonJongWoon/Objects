package com.example.objects.chap01.before;

// 판매원
public class TicketSeller {

    private TicketOffice ticketOffice; // 판매원이 일하는 매표소

    // 판매원이 일하는 매표소 강제하는 생성자
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}

package com.example.objects.chap01.before;

// 소극장
public class Theater {
    private TicketSeller ticketSeller; // 판매원

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee()); // 티켓 구입
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); // 티켓 판매
            audience.getBag().setTicket(ticket);
        }
    }
}

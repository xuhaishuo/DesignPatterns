package com.xhs.singleton;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/25 10:56
 * @since
 */
public class TicketMarker {
    private int ticket = 1000;
    private static TicketMarker ticketMarker = new TicketMarker();

    private TicketMarker() {

    }

    public int getNextTickerNumber() {
        return ticket++;
    }

    public static TicketMarker getInstance() {
        return ticketMarker;
    }
}

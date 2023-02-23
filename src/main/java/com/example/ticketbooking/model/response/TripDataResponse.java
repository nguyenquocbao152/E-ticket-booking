package com.example.ticketbooking.model.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class TripDataResponse implements Serializable {
    private String liencePlate; // vehicle
    private String from;
    private String arrival;
    private String fare;// route
    private String date;
    private String time;//trip
    private String stationStart;
    private String stationEnd;
    private String totalSeat;// tính tổng số ghế còn trống


}

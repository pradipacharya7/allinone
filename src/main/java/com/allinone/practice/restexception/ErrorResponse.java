package com.allinone.practice.restexception;

import java.util.Date;

public class ErrorResponse {
    private String message;
    private boolean status;
    private Date timestramp;
    private String Details;

    public ErrorResponse(String message, boolean status, Date timestramp, String details) {
        this.message = message;
        this.status = status;
        this.timestramp = timestramp;
        this.Details = details;
    }

    public ErrorResponse(){

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTimestramp() {
        return timestramp;
    }

    public void setTimestramp(Date timestramp) {
        this.timestramp = timestramp;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}

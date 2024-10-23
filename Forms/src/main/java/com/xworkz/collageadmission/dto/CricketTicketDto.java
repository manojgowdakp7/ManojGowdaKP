package com.xworkz.collageadmission.dto;


public class CricketTicketDto {

    String groundName;
    String CustomerName;
    String CustomerEmail;
    String seatType;
    String noOfTickets;

    public CricketTicketDto() {
        super();
    }

    public CricketTicketDto(String groundName, String customerName, String customEmail, String seatType,
                            String noOfTickets) {
        super();
        this.groundName = groundName;
        this.CustomerName = customerName;
        this.CustomerEmail = customEmail;
        this.seatType = seatType;
        this.noOfTickets = noOfTickets;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomEmail() {
        return CustomerEmail;
    }

    public void setCustomEmail(String customEmail) {
        CustomerEmail = customEmail;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(String noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CustomerEmail == null) ? 0 : CustomerEmail.hashCode());
        result = prime * result + ((CustomerName == null) ? 0 : CustomerName.hashCode());
        result = prime * result + ((groundName == null) ? 0 : groundName.hashCode());
        result = prime * result + ((noOfTickets == null) ? 0 : noOfTickets.hashCode());
        result = prime * result + ((seatType == null) ? 0 : seatType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CricketTicketDto other = (CricketTicketDto) obj;
        if (CustomerEmail == null) {
            if (other.CustomerEmail != null)
                return false;
        } else if (!CustomerEmail.equals(other.CustomerEmail))
            return false;
        if (CustomerName == null) {
            if (other.CustomerName != null)
                return false;
        } else if (!CustomerName.equals(other.CustomerName))
            return false;
        if (groundName == null) {
            if (other.groundName != null)
                return false;
        } else if (!groundName.equals(other.groundName))
            return false;
        if (noOfTickets == null) {
            if (other.noOfTickets != null)
                return false;
        } else if (!noOfTickets.equals(other.noOfTickets))
            return false;
        if (seatType == null) {
            if (other.seatType != null)
                return false;
        } else if (!seatType.equals(other.seatType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CricketTicketDto [GroundName=" + groundName + ", CustomerName=" + CustomerName + ", CustomEmail="
                + CustomerEmail + ", SeatType=" + seatType + ", NoOfTickets=" + noOfTickets + "]";
    }

}

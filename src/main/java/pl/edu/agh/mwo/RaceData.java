package pl.edu.agh.mwo;

public class RaceData {

    int sessionKey;

    int meetingKey;

    double pitDuration;
    int driverNumber;
    int lapNumber;

    public double getPitDuration() {
        return pitDuration;
    }
    public void setPitDuration(double pitDuration) {
        this.pitDuration = pitDuration;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(int sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public void setMeetingKey(int meetingKey) {
        this.meetingKey = meetingKey;
    }
}


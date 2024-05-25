package pl.edu.agh.mwo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class RaceData {


    @JsonProperty("session_key")
    int sessionKey;

    @JsonProperty("meeting_key")
    int meetingKey;

    @JsonProperty("date")
    String date;
    @JsonProperty("pit_duration")
    double pitDuration;
    @JsonProperty("driver_number")
    int driverNumber;

    @JsonProperty("lap_number")
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

}


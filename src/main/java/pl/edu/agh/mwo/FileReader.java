package pl.edu.agh.mwo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("pitstops-data.json"));

        RaceData[] raceData = objectMapper.readValue(new File("pitstops-data.json"),(RaceData[].class));

    }
}

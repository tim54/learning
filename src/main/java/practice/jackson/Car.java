package practice.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Car {
    @JsonProperty("color")
    public String color;
    @JsonProperty("type")
    public String type;

    public Car(){

    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
}
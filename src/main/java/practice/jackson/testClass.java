package practice.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class testClass {
    public static void main(String ...arg) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        Car car = new Car("yellow", "renault");
        objectMapper.writeValue(new File("car.json"), car);
        String carAsString = objectMapper.writeValueAsString(car);
        System.out.println(carAsString);

        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        Car car1 = objectMapper.readValue(json, Car.class);
        System.out.println();
    }
}

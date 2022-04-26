package HomerWork;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;

public class JsonConvert {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Employee employee = new Employee(23,"Artur","Hayrapetyan",
                new Address("Garni", "Armenia", "Charenci", "3"),new ArrayList<>());
        PhoneNumber p = new PhoneNumber("45656645", PhoneNumberType.OTHER);
        String result;
        try {
            result = objectMapper.writeValueAsString(employee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        String file = "src/main/resources/package.json";
        System.out.println(result);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String string;
            while (true) {
                if ((string = reader.readLine()) != null) {
                    reader.close();
                    break;
                }
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

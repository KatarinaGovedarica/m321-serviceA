package com.example.service_a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PeopleController {

    @GetMapping("/people")
    public List<Map<String, String>> getPeople() {
        return List.of(
                Map.of(
                        "firstName", "Max",
                        "lastName", "Muster",
                        "street", "Bahnhofstrasse 10",
                        "postalCode", "8001",
                        "city", "Zürich"
                ),
                Map.of(
                        "firstName", "Anna",
                        "lastName", "Meier",
                        "street", "Seestrasse 5",
                        "postalCode", "6003",
                        "city", "Luzern"
                )
        );
    }
}
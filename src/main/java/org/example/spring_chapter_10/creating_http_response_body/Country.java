package org.example.spring_chapter_10.creating_http_response_body;

import lombok.Getter;
import lombok.Setter;

public class Country {
    private String name;
    private int population;

    /*
    to make a Country instance simpler, we define
    a static factory method that receives the name
    and the population. This method returns a Country
    instance with the provided values set.
     */
    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

}

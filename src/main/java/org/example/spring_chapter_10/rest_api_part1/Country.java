package org.example.spring_chapter_10.rest_api_part1;

public class Country {
    private String name;
    private int population;

    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPopulation() {
        return String.valueOf(population);
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

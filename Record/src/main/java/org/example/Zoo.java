package org.example;

import java.util.List;

public record Zoo(
        List<Animal> animals
) {

    public int calculateTotalFoodRequirement(){
        int totalFoodRequirement = 0;
        for(Animal animal:animals){
            totalFoodRequirement ++;
        }
        return totalFoodRequirement;
    }
}

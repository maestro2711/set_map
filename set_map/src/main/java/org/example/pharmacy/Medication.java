package org.example.pharmacy;

import java.util.Objects;

public class Medication {
    private String name;
    private int Price;
    private boolean isAvalaible;


    public Medication(String name, int price, boolean isAvalaible) {
        this.name = name;
        Price = price;
        this.isAvalaible = isAvalaible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public boolean isAvalaible() {
        return isAvalaible;
    }

    public void setAvalaible(boolean avalaible) {
        isAvalaible = avalaible;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", isAvalaible=" + isAvalaible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Price == that.Price && isAvalaible == that.isAvalaible && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Price, isAvalaible);
    }


}

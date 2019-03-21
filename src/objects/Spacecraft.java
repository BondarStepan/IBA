package objects;

import java.util.Objects;

public class Spacecraft {
    private String name;
    private String classification;
    private int capacity;

    public Spacecraft() {
    }

    public Spacecraft(String name, String classification, int capacity) {
        this.name = name;
        this.classification = classification;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return capacity == that.capacity &&
                Objects.equals(name, that.name) &&
                Objects.equals(classification, that.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classification, capacity);
    }

    @Override
    public String toString() {
        return "Spacecraft{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

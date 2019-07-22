package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class BirdObject {
   @Column(nullable = false)
    private String name;
   @Column(nullable = false)
    private String colours;
   private String birdSize;

    public BirdObject (String name, String colours, String birdSize) {
    this.name = name;
    this.colours = colours;
    this.birdSize = birdSize;
}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public BirdObject(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;

    }

    public String getbirdSize() {
        return birdSize;
    }

    public void setbirdSize(String birdSize) {
        birdSize = birdSize;
    }

    @Override
    public String toString() {
        return "BirdObject{" +
                "name='" + name + '\'' +
                ", colours='" + colours + '\'' +
                ", birdSize='" + birdSize + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirdObject that = (BirdObject) o;
        return getId() == that.getId() &&
                getName().equals(that.getName()) &&
                getColours().equals(that.getColours()) &&
                birdSize.equals(that.birdSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColours(), birdSize, getId());
    }
}

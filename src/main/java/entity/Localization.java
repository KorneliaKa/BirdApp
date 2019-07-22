package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Localization {


    private String continent;
    private String country;
    private String environment;

    public Localization (String continent, String country, String environment) {
        this.continent = continent;
        this.country = country;
        this.environment = environment;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Localization() { //dlaczego potrzebuję tego pustego konstruktora?

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "Localization{" +
                "id=" + id +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localization that = (Localization) o;
        return getId() == that.getId() &&
                getContinent().equals(that.getContinent()) &&
                Objects.equals(getCountry(), that.getCountry()) &&
                getEnvironment().equals(that.getEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContinent(), getCountry(), getEnvironment());
    }
}

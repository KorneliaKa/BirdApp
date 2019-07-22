import entity.BirdObject;
import entity.Localization;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BirdDataMethods {

    EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("BirdApp");

    public BirdObject addBird(String name, String colours, String birdSize) {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    BirdObject bird = new BirdObject(name, colours, birdSize);
    entityManager.persist(bird);
    entityManager.getTransaction().commit();
    return bird;


}

 public Localization addLocalization(String continent, String country, String environment) {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    Localization localization = new Localization(continent, country, environment);
    entityManager.persist(localization);
    entityManager.getTransaction().commit();
    return localization;
}

public BirdObject findBirdUsingColours(String colours) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        BirdObject birdObject = entityManager.find(BirdObject.class, colours);
        if(colours != null) {
            entityManager.find(BirdObject.class, colours);
            birdObject.getColours();}
        if(colours == null) {
            System.out.println("No birds with such colours in database!");
            entityManager.getTransaction().rollback();
        }
        else {
            entityManager.getTransaction().commit();
        }
        return birdObject;
}

public Localization findBirdUsingContinent(String continent) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("birdBase");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Localization localization = entityManager.find(Localization.class, continent);
    entityManager.getTransaction().begin();
    if(continent !=null) {
        entityManager.find(Localization.class, continent);
        localization.getContinent();
    }

    if(continent == null) {
        System.out.println("No such continent in database!");

    }
    return localization;

}



}

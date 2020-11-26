package be.district09.sf;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quarkus_data")
public class QuarkusData extends PanacheEntity {

//    @Id
//    private int id;

    private String name;

    public QuarkusData() {
    }

    public QuarkusData(String name) {
//        this.id = id;
        this.name = name;
    }

    public static QuarkusData findById(long id) {
        return find("id", id).firstResult();
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

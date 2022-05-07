package ee.cs.ut.esi.bpb.entities;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manager_id")
    private int id;
    @Column(name = "name")
    private String name;

    public Manager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager(String name) {
        this.name = name;
    }
}
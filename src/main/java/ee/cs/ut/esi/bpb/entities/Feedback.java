package ee.cs.ut.esi.bpb.entities;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "feedback_id")
    private int id;
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "description")
    private String description;

    public Feedback() {
    }

    public Feedback(int orderId, String description) {
        this.orderId = orderId;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
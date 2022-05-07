package ee.cs.ut.esi.bpb.entities;

import javax.persistence.*;

@Entity
@Table(name = "refundRequest")
public class RefundRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "refundrequest_id")
    private int id;
    @Column(name = "description")
    private String description;

}
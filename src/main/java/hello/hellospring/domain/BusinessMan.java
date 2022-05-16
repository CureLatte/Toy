package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class BusinessMan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    @ManyToOne
    private Store Store;

}

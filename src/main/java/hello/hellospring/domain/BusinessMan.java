package hello.hellospring.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class BusinessMan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    @ManyToOne
    private Store store;

    // id
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


    // email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    // phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }


    // store
    public Store getStore(){
        return store;
    }
    public void setStore(Store store){
        this.store = store;
    }
}

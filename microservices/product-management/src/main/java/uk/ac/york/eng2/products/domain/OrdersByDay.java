package uk.ac.york.eng2.products.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.sql.Date;

@Serdeable
@Entity
public class OrdersByDay {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Date day;

    @Column
    private int count;

    @JsonIgnore
    @ManyToOne
    private Product product;

    public OrdersByDay() {}

    public OrdersByDay(Product product, Date day) {
        this.product = product;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

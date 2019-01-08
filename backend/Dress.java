package com.example.semaster61.Entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.*;

import lombok.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name="dress")

public class Dress {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   String name;
    private   String color;

    @ManyToOne
   private Size size;

    protected Dress(){}

    public Dress(Long id,String name,String color) {
        this.id = id;
        this.name = name;
        this.color = color;
}


}
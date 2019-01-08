package com.example.semaster61.Entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.*;
@Entity
@Data
@Table(name="using")

public class Using {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   Date date;

    @ManyToOne
    
    private Event event;

    @ManyToOne
    
    private Dress dress;

    @ManyToOne
    
    private Artist art;

  protected Using(){}

}
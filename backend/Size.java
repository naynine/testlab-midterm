package com.example.semaster61.Entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.*;
@Entity
@Data
@Table(name="size")

public class Size {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   String size;

    protected Size(){}
    public Size(Long id,String size) {
        this.id = id;
        this.size = size;
}}
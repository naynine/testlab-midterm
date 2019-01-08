package com.example.semaster61.Entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Table(name="artist")

public class Artist {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Using> using = new ArrayList<>();

    protected Artist(){}

    public Artist(Long id,String name) {
        this.id = id;
        this.name = name;
}
}
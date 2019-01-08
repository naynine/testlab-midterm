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
@Table(name="event")

public class Event {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   Long id;
    private   String name_event;

    protected Event(){}

    public Event(Long id,String name_event) {
        this.id = id;
        this.name_event = name_event;
}}
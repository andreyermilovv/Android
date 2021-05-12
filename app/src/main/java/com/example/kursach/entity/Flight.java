package com.example.kursach.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Flight {

    @PrimaryKey(autoGenerate = true)
    public Integer id;
}

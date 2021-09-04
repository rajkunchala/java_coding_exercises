package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {

    private final LocalDateTime localDateTime;

    public Exercise004(LocalDate date) {

        this.localDateTime = LocalDateTime.of(date, LocalTime.of(0,0));

    }

    public Exercise004(LocalDateTime dateTime) {

        this.localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {

        return this.localDateTime.plusSeconds(1000000000);
    }
}

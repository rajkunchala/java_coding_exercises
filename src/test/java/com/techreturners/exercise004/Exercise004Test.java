package com.techreturners.exercise004;

//import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenFutureDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.NOVEMBER, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2053, Month.JULY, 14, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }
    @Test
    public void checkGetDateTimeWhenCurrentDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.now());
        LocalDateTime expected = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS).plusSeconds(1000000000);

        assertEquals(expected, ex004.getDateTime());
    }

}

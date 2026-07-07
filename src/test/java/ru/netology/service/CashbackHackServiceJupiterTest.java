package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);   // порядок: expected, actual (как в JUnit4)
    }

    // ... допиши остальные кейсы: 1500→500, 1000→0 (баг), 800→200
    @Test
    public void shouldReturn500WhenAmount1500(){
        CashbackHackService service =  new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn0WhenAmount1000(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn200WhenAmount800(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;

        assertEquals(expected, actual);
    }
}
package ru.netology.service;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500WhenAmount1500(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }


    //по сути же правильно будет 0, но из-за логики remain оно будет возвращать 1000, по сути нужно
    // переделывать условия CashbackHackService, что бы оно выдавало 0
    @Test
    public void shouldReturn0WhenAmount1000(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}

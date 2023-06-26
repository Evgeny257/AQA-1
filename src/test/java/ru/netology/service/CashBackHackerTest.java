package ru.netology.service;
import org.testng.annotations.Test;
import org.testng.Assert;


public class CashBackHackerTest {
    @Test
    void valueUnderBoundary()

    {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void valueBoundary()

    {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void valueOverBoundary()
    {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(1500);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void zeroValue()
    {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(actual, expected);
    }
}
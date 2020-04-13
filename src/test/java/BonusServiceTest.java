import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndBorderLimit() {
        BonusService service = new BonusService ();
        // подготавливаем данные:
        long expected = 0;
        // вызываем целевой метод:
        long actual = service.calculate ( 0, true );
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals ( expected, actual );
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndBorderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long expected = 0;
        // вызываем целевой метод:
        long actual = service.calculate(0, false);
        // производим проверку (сравниваем ожидаемый и фактический результаты)
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndEqualLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long expected = 0;
        // вызываем целевой метод:
        long actual = service.calculate(500, true);
        assertEquals(expected, actual);// производим проверку (сравниваем ожидаемый и фактический результаты)
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndEqualLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long expected = 0;
        // вызываем целевой метод:
        long actual = service.calculate(500, false);
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический результаты)
    }
}

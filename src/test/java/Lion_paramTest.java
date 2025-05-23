
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.example.Feline;
import com.example.Lion;

@RunWith(Parameterized.class)
public class Lion_paramTest {

    private final String sex;
    private boolean hasMane;
    Lion lion;

    //Конструктор для теста
    public Lion_paramTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    //Параметры для теста
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
            {"Самка", false},
            {"Самец", true},
        };
    }

    //Тест на наличие гривы
    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        lion = new Lion(sex, feline);
        String message = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(message, hasMane, lion.doesHaveMane());
    }
}

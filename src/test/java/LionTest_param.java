
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.example.Lion;

@RunWith(Parameterized.class)
public class LionTest_param {

    private final String sex;
    private boolean hasMane;
    Lion lion;

    //Конструктор для теста
    public LionTest_param(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    //Параметры для теста
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
            {"Самка", false},
            {"Самец", true},
            {"Оно", true},
        };
    }

    //Тест на наличие гривы
    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion(sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}

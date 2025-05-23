import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.Feline;
import com.example.Lion;

public class LionTest {

    Lion lion;
    
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //Тест на неправильный пол
    @Test
    public void lionBrokenSexTest() {
        String sex = "Оно";
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(sex, feline);
        });

        assertEquals(expectedMessage, exception.getMessage());
    }

    
    //Тест для рациона львов
    @Test
    public void lionGetFoodTest () throws Exception {
        lion = new Lion("Самец", feline);
        List<String> lionFoods = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(lionFoods);
        assertEquals(lionFoods, lion.getFood());
    }

    //Тест для львят
    @Test
    public void getKittensTest() throws Exception {
        lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
    }
}

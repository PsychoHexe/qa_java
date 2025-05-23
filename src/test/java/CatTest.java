import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.Cat;
import com.example.Feline;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Rule
    public final ErrorCollector errorCollector = new ErrorCollector();

    Cat cat;

    //Создание мок
    @Mock
    Feline feline;

    //Тест для звуков, издающих кошкой
    @Test
    public void catSoundTest() {
        cat = new Cat(feline);
        String voice = cat.getSound();
        assertEquals("Мяу", voice);
    }
    
    //Тест для рациона котов
    @Test
    public void catGetFoodTest () throws Exception {
        cat = new Cat(feline);
        List<String> catFoods = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(catFoods);
        assertEquals(catFoods, cat.getFood());
    }

    
}

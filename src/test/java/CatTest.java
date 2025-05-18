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

    private Feline feline;

    //Создание мок
    @Mock
    Cat cat;

    //Тест для звуков, издающих кошкой
    @Test
    public void catSoundTest() {
        cat = new Cat(feline);
        String voice = cat.getSound();
        assertEquals("Мяу", voice);
    }
    
    //Тест для рациона котов
    @Test
    public void catEatingTest () throws Exception {

        List<String> catFoods = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(catFoods);
        assertEquals(catFoods, cat.getFood());
    }

}

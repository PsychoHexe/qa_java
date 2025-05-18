import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.example.Feline;
import com.example.Lion;

public class LionTest {

    @Mock
    Lion lion;
    Feline feline;

    //Тест для рациона львов
    @Test
    public void lionEatingTest () throws Exception {
        lion = Mockito.mock(Lion.class);
        feline = new Feline();
        List<String> lionFoods = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(lionFoods);
        assertEquals(feline.getFood("Хищник"), lion.getFood());
    }
}

import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.Feline;


public class FelineTest {

    Feline feline = new Feline();
    List<String> foods_pred = List.of("Животные", "Птицы", "Рыба");
    List<String> foods_her = List.of("Трава", "Различные растения");
    int kittensCount = 7;

    //Тест для метода по рациону мясной еды
    @Test
    public void eatMeatTest() throws Exception {

        assertEquals(foods_pred, feline.eatMeat());
    }

    //Тест для метода по рациону веганской еды
    @Test
    public void eatNotMeatTest() throws Exception {

        assertEquals(foods_her, feline.getFood("Травоядное"));
    }

    //Тест для метода по семейству
    @Test
    public void getFamilyTest() {
        
        assertEquals("Кошачьи", feline.getFamily());
    }

    //Тест для метода с 1 котенком
    @Test
    public void oneKittenTest() {
        assertEquals(1, feline.getKittens());
    }

    //Тест для метода с кол-вом котят больше 1
    @Test
    public void kittensTest() {
        assertEquals(kittensCount, feline.getKittens(7));
    }

}

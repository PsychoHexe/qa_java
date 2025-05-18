import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.Feline;


public class FelineTest {

    Feline feline = new Feline();
    List<String> foods1 = List.of("Животные", "Птицы", "Рыба");
    List<String> foods2 = List.of("Трава", "Различные растения");
    int kittensCount = 7;

    //Тест для метода по рациону мясной еды
    @Test
    public void eatMeatTest() throws Exception {

        assertEquals(foods1, feline.eatMeat());
    }

    //Тест для метода по рациону веганской еды
    @Test
    public void eatNotMeatTest() throws Exception {

        assertEquals(foods2, feline.getFood("Травоядное"));
    }

    //Тест для метода по семейству
    @Test
    public void getFamilyTest() {
        
        assertEquals("Кошачьи", feline.getFamily());
    }

    //Тест для метода с 1 котенком
    @Test
    public void oneKitten() {
        assertEquals(1, feline.getKittens());
    }

    //Тест для метода с кол-вом котят больше 1
    @Test
    public void kittens() {
        assertEquals(kittensCount, feline.getKittens(7));
    }

}

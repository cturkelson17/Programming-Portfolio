import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void test()
    {
        String word = "olleh";
        String appWord = App.reverse("hello");
        assertEquals(word,appWord);
    }
    @Test
    public void test2()
    {
        String word = "racecar";
        String appWord = App.reverse("racecar");
        assertEquals(word,appWord);
    }
    @Test
    public void test3()
    {
        String word = "madagascar";
        String appWord = App.reverse("racsagadam");
        assertEquals(word,appWord);
    }
}

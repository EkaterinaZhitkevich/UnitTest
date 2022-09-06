import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
   @Test
    public void test_Contact_equals(){
     //given
    Contact contact1 = new Contact("Anya", "+79006280214");
    Contact contact2 = new Contact("Anya", "+79006280214");

    //when
    boolean result = contact1.equals(contact2);

    //then
        Assertions.assertTrue(result);
    }
}

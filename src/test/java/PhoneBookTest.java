import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBookTest {
    @Test
public void test_phonebook_addGroup_throwsException(){
        //given
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.phonebook.put("study", new ArrayList<>());
        String testStr = "study";
        List<Contact> testList = new ArrayList<>();

        //when

        //then
        Assertions.assertThrows(PhonebookException.class, () -> phoneBook.addGroup(testStr, testList));
    }

    @Test
    public void test_phonebook_searchContactByNumber(){
        //given
        String number = "89203825621";
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Masha","89203825621");
        List<Contact> testList = new ArrayList<>();
        testList.add(contact);
        phoneBook.phonebook.put("study", testList);

        //when
        Contact result = phoneBook.searchContactByNumber(number);

        //then
        Assertions.assertEquals(contact, result);

    }

}

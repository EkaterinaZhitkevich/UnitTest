import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws PhonebookException {
        PhoneBook KatyaPhone = new PhoneBook();
        Contact anya = new Contact("Аня", "89056298719");
        Contact vasya = new Contact("Вася", "89628567485");
        Contact masha = new Contact("Маша", "89053298264");
        Contact dima = new Contact("Дима", "89006598735");

        List<Contact> work = KatyaPhone.createContacts(new ArrayList<>(), anya, vasya);
        List<Contact> family = KatyaPhone.createContacts(new ArrayList<>(), masha, dima);

        KatyaPhone.addGroup("Работа", work);
        KatyaPhone.addGroup("Семья", family);

        KatyaPhone.addContactToPhonebook("Работа", dima);
//            KatyaPhone.addGroup(KatyaPhone.phonebook, "Семья", work);
        System.out.println(KatyaPhone.phonebook);
        Contact contact = KatyaPhone.searchContactByNumber("89006598735");
        System.out.println(contact);
    }
}


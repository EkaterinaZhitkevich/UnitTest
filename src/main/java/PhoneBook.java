import java.util.*;

public class PhoneBook {
    protected Map<String, List<Contact>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }


    public void addContactToPhonebook(String nameOfGroup, Contact contact) {
        if (phonebook.containsKey(nameOfGroup)) {
            List<Contact> list = phonebook.get(nameOfGroup);
            list.add(contact);
            phonebook.put(nameOfGroup, list);
        }
    }

    public void addGroup(String nameOfGroup, List<Contact> list) throws PhonebookException {
        if (phonebook.containsKey(nameOfGroup)) {

            throw new PhonebookException("Группа \"" + nameOfGroup + "\" уже существует!");
        }
        phonebook.put(nameOfGroup, list);
    }

    public void searchContactsByName(String nameOfGroup) throws PhonebookException {
        if (phonebook.containsKey(nameOfGroup)) {
            List<Contact> contacts = phonebook.get(nameOfGroup);
            printContacts(contacts);
        } else {
            throw new PhonebookException("Такой группы не существует!");
        }
    }

    public Contact searchContactByNumber(String number) {
        List<Contact> contacts = new ArrayList<>();
        Contact contact = null;
        for (Map.Entry<String, List<Contact>> entry : phonebook.entrySet()) {
            contacts = entry.getValue();
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).number.equals(number)) {
                contact = contacts.get(i);
            }
        }
        return contact;
    }

    public List<Contact> createContacts(List<Contact> list, Contact... contact) {
        for (int i = 0; i < contact.length; i++) {
            list.add(contact[i]);
        }
        return list;
    }

    public void printContacts(List<Contact> list) {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
}

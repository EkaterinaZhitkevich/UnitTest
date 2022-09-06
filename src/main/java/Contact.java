import java.util.List;
import java.util.Objects;

public class Contact {
    protected String name;
    protected String number;


    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNameByNumber(String number){
        if (number.equals(this.number)) {
            return this.name;
        }
        return this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return number == contact.number && name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Контакт: " +
                "Имя - '" + name + '\'' +
                ", номер телефона - " + number;
    }
}

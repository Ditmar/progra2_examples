package schedule;

import java.util.HashMap;

public class ManagerContact {
    private HashMap<String, Contact> contactList;
    public ManagerContact() {
        this.contactList = new HashMap<>();

    }
    private void printContact(Contact contact) {
        System.out.println("----------------------------------");
        System.out.println("Name: " + contact.getName());
        System.out.println("Age: " + contact.getAge());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("----------------------------------");
    }
    public void add(String name, Integer age, String email) {
        Contact newContact = new Contact(name, age, email);
        this.contactList.put(newContact.getEmail(), newContact);
    }
    public void search(String email) {
        Contact result = this.contactList.get(email);
        this.printContact(result);
    }
    public void remove(String email) {
        Contact result = this.contactList.remove(email);
        System.out.println("The contact was removed");
        this.printContact(result);
    }
    public void printList() {
        for (Contact contact : this.contactList.values()) {
            this.printContact(contact);
        }
    }
}

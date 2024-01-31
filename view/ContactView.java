/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Contact;
import model.ContactManagement;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class ContactView {
    ContactManagement cm = new ContactManagement();
    Validation v = new Validation();
    
    public void addContact()
    {
        int id = cm.getContactList().size() + 1;
        String firstName = v.getString("first name");
        String lastName = v.getString("last name");
        String group = v.getString("group");
        String address = v.getString("address");
        String phone = v.getPhone();
        
        Contact contact = new Contact(id, firstName, lastName, group, address, phone);
        cm.getContactList().add(contact);
        System.out.println("Add successful!!!");
    }
    
    public void display()
    {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        rowBorder(5); rowBorder(25); rowBorder(20); rowBorder(20); rowBorder(15); rowBorder(20); rowBorder(25); System.out.println("|");

        System.out.printf("%-5s%-25s%-20s%-20s%-15s%-20s%-25s", "|ID", "|Name", "|First Name", "|Last Name", "|Group", "|Address", "|Phone");
        System.out.println("|");
        
        rowBorder(5); rowBorder(25); rowBorder(20); rowBorder(20); rowBorder(15); rowBorder(20); rowBorder(25); System.out.println("|");
        for (Contact c: cm.getContactList())
        {
            c.outputFormat();
        }
 
        System.out.println("|");
        rowBorder(5); rowBorder(25); rowBorder(20); rowBorder(20); rowBorder(15); rowBorder(20); rowBorder(25); System.out.println("|");
        
    }
    
    public void delete()
    {
        int id = v.getInteger("ID");
        boolean isExist = false;
        
        for (int i = 0; i < cm.getContactList().size(); i++)
        {
            if (cm.getContactList().get(i).getId() == id)
            {
                isExist = true;
            }
        }
        
        if (isExist)
        {
            cm.getContactList().remove(cm.getContactList().get(id));
            System.out.println("Remove successful!!!");
        }else
        {
            System.out.println("Id not exist!!!");
        }
    }
    
    public void rowBorder(int number)
    {   
        System.out.print("|");
        for (int i = 0; i < number - 1; i++)
        {
            System.out.print("-");
        }
    }
}

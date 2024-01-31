/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import view.ContactView;

/**
 *
 * @author 84898
 */
public class ContactController extends Menu{
    public void menu(ContactView cv)
    {
        String[] content = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        Menu m = new Menu("========= Contact program =========", content) {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: 
                        System.out.println("-------- Add a Contact --------");
                        cv.addContact(); break;
                    case 2:
                        cv.display();break;
                    case 3:
                        System.out.println("------- Delete a Contact -------");
                        cv.delete(); break;
                }
            }
        };
        m.run();
    }
    
    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

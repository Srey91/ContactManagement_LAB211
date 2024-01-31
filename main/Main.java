/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ContactController;
import view.ContactView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        ContactView cv = new ContactView();
        ContactController cc = new ContactController();
        
        cc.menu(cv);
    }
}

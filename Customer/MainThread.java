/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Ducdongpro
 */
public class MainThread {
    public static void main(String[] args) {
        Customer customer01 = new Customer(001, "Dông", "dongvdd00422@gmail.com", "1-1-1994", 100000, "img/avatar.jpg", 2);
        customer01.selectProduct("ô tô");
        customer01.checkout();
        System.out.println(customer01.toString());
    }
}

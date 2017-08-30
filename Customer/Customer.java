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
public class Customer {
    private int id;
    private String name;
    private String email;
    private String birthday;
    private double balance;
    private String avatar;
    private int status;
    
    //constructor
    public Customer(){
    
    }
    
    public Customer(int id, String name, String email, String birthday, double balance, String avatar, int status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.balance = balance;
        this.avatar = avatar;
        this.status = status;
    }
    
    // geter & seter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    // methods
    public void selectProduct(String productName){
        System.out.println("Khách hàng đã lựa chọn sản phẩm " + productName);
    }
    
    public void checkout(){
        System.out.println("Người dùng thực hiện thanh toán hoá đơn.");
    }

    @Override
    public String toString() {
        return "Thông tin khách hàng \n"
                + "Mã khách hàng = " + id +"\n"
                + "Tên = " + name +"\n"
                + "email = " + email +"\n"
                + "Năm sinh = " + birthday +"\n" 
                + "Tài khoản = " + balance +"$\n"
                + "Ảnh đại diện = " + avatar +"\n"
                + "Trạng thái = " + status;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_restaurante;


public class Username {
    
    private int id;
    private String usernames;
    private String password;
    
    public Username() {}
    
    public Username(int id, String usernames, String password) {
        this.id = id;
        this.usernames = usernames;
        this.password = password;
    }
    
    public int getId(){
        return id;
    }
    
    public String getUsername() {
        return usernames;
    }
    
    public String getPassword() {
        return password;
    }
}

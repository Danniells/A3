/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_restaurante;


public class Username {
    
    private int id;
    private String usernames;
    private String password;
    private String email;
    private String cpf;
    private String name;
    
    public Username() {}
    
    public Username(int id, String usernames, String password, String email, String cpf, String name) {
        this.id = id;
        this.usernames = usernames;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
        this.name = name;
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
    
    public String getEmail() {
        return email;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getName() {
        return name;
    }
}

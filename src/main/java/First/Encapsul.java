/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author Bharti
 */
public class Encapsul {
    private String name;
// Getter
public String getName() {
return name;
}
// Setter
public void setName(String newName) {
this.name = newName;
}
}
 public class Demo9  {
public static void main(String[] args) {
Encapsul user = new Encapsul();
user.setName("Felix ITs");
System.out.println(user.getName());
}
}
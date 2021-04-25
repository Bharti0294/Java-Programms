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
public class Power {
   
String name = "Andy";
}
 class Special extends Felix {
String name = "John";

void showNames() {
System.out.println(name);
//System.out.println(super.name);
}

    
   
}
class Add {
public static void main(String args[]) {
Special f = new Special();
f.showNames();
}
}



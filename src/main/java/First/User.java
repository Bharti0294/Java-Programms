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
public abstract class User {

    static boolean add3(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean add3(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
abstract void showMessage();
}
class User1 extends User {
void showMessage() {
System.out.println("User 1 class");
}
}
class User2 extends User {
void showMessage() {
System.out.println("User 2 class");
}
}
class Demo2 {
public static void main(String args[]) {
User2 user2 = new User2();
user2.showMessage();
}
}


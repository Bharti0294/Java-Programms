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

    public abstract class Filex {
    abstract void showMessage();

}
class Demo extends Filex {
void showMessage() {
System.out.println("This is message from method 1");
}
public static void main(String args[]) {
Demo obj = new Demo();
obj.showMessage();
}
}


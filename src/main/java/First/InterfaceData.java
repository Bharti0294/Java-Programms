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
public interface InterfaceData {
  
void showMessage();
}
class Demo5 implements InterfaceData {
public void showMessage() {
System.out.println("Hello from Java");
}
public static void main(String args[]) {
Demo5 demo = new Demo5();
demo.showMessage();
}
}


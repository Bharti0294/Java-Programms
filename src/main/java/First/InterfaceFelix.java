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
public interface InterfaceFelix {
    
void feliIts();
}
 interface Person {

void showMessage();
}
class Demo6 implements Person, InterfaceFelix {
public void showMessage() {
System.out.println("Hello from Java");
}
public void feliIts(){
System.out.println("Message from Felix Its Method");
}
public static void main(String args[]) {
Demo6 demo = new Demo6();
demo.showMessage();
demo.feliIts();
}

}

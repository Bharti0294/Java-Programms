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
public interface Interface {
    
void feliIts();
}
interface Data1 extends Interface {
void showMessage();
}
class Demo7 implements Data1 {
public void showMessage() {
System.out.println("Hello from Java");
}
public void feliIts(){
System.out.println("Message from Felix Its Method");
}
public static void main(String args[]) {
Demo7 demo = new Demo7();
demo.showMessage();
demo.feliIts();
}
}

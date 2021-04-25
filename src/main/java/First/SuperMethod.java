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
public class SuperMethod {

    void method1() {
        System.out.println("Method 1 in Felix Class...");
    }
}

class Seeds extends SuperMethod {

    void method2() {
        System.out.println("Method 1 in FelixITs Class...");
    }

    void method3() {
        System.out.println("Method 2 in FelixITs Class...");
    }

    void showMessage() {
        super.method1();
        method1();
    }
}

class Add1 {

    public static void main(String args[]) {
        Seeds f = new Seeds();
        f.showMessage();
    }

}

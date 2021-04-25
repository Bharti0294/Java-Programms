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
abstract class Bank {
abstract int getRateOfInterest();
}
class SBI extends Bank {
int getRateOfInterest() {
return 7;
}
}
class PNB extends Bank {
int getRateOfInterest() {
return 9;
}
}
class Demo3 {
public static void main(String args[]) {
PNB pnb = new PNB();
int interest = pnb.getRateOfInterest();
System.out.println("Rate of Interest is: " + interest + " %");
}
}

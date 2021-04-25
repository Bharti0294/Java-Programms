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
public class SupConts {
    SupConts() {
System.out.println("This is Felix class");
}
}
class FelixITs extends SupConts {
FelixITs() {
super();
System.out.println("This is FelixITs Class");
}
}
class Add2 {
public static void main(String args[]) {
FelixITs f = new FelixITs();
}

}

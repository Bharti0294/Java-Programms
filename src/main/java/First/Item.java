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
import java.util.ArrayList;

public class Item {

    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("HTML");
        lang.add("CSS");
        lang.add("Bootstrap");
        lang.add("Java");
        lang.add("PHP");
        lang.add("Android");
        System.out.println(lang.get(1));
    }
}

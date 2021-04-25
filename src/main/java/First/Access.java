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
import java.util.HashMap;

public class Access {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("fname", "Felix");
        hashMap.put("lname", "ITs");
        hashMap.put("since", "20");
        hashMap.put("city", "Pune");
        System.out.println(hashMap.get("fname"));
    }
}

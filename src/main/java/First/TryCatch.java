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
public class TryCatch {

    

        public static void main(String[] args) {
            try {
                String lang[] = {"HTML", "CSS", "Bootstrap", "PHP", "Java", "Android"};
                System.out.println(lang[6]);
            } catch (Exception e) {
                System.out.println("Something is wrong in code");
            }
        }
    }


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
 public class User3 {

    

        static int add(int a, int b) {
            return a + b;
        }

        static int add(int a, int b, int c) {
            return a + b + c;
        }

    static boolean add3(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean add3(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    class Add3 {

        public static void main(String[] args) {
            System.out.println(User3.add3(10, 20));
            System.out.println(User3.add3(10, 20, 30));
        }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Edgaras
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] m = {5, 12, -3, 8, -1};
        //Atspausdinam pirmą eilutę
        for (int s = 0; s < m.length; s++) {
            System.out.print(m[s] + " ");
        }
        System.out.println("");
        //Formuojam naujus masyvus ir juos spausdinam
        for (int i = 0; i < m.length - 1; i++) {
            //Sukuriam naują masyvą
            int[] m1 = new int[m.length];
//            Naujam masyvui priskiriam reikšmes
            for (int j = 0; j < m.length - 1; j++) {
                m1[j + 1] = m[j];
                m1[0] = m[m.length - 1];
            }
//            Atspausdinam naujo sukurto masyvo reikšmes
            for (int s = 0; s < m1.length; s++) {
                System.out.print(m1[s] + " ");
            }
            System.out.println("");
//            Prisikiriam, kad senas masyvas rodytų į naują masyvą
            m = m1;
//            Naujas masyvas numirė (bet senas rodo į tą objektą, kuris buvo naujai suformuotas), sekančioje iteracijoje [i] kursime vėl naują masyvą
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author emre
 */
import java.util.Scanner;
import java.util.Random;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ISBN numarasını giriniz.(İlk 9 hanesi)");//123456789
        int isbn= new Scanner(System.in).nextInt();
        int checksum= (((isbn/100000000)*1)+((isbn/10000000)%10*2 + ((isbn/1000000)%10*3)+ ((isbn/100000)%10*4)+ ((isbn/10000)%10*5)+ ((isbn/1000)%10*6)+ ((isbn/100)%10*7)+ ((isbn/10)%10*8)+ isbn%10)%11);
        
        String output= Integer.toString(isbn);
        String checksumString= Integer.toString(checksum);
        System.out.println(output+checksumString);
        
    }
    
}
/*
isbn kontrol
10 karakterdir
d1 d2 d3 d4 d5 d6 d7 d8 d9 tane gir d10' kendin bul

d10 checksum ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11

eğer toplam 10 ise d10 = x
*/
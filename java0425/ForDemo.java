
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class ForDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){//for(;;)相當於while(true)
            int n=new Random().nextInt(100);
            System.out.println("i="+i+", n="+n);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class DefMethod {
    public static void main(String[] args) {
        sub1(10, 20);
        int sum=sub2(10, 20, 30);
        System.out.println("Main得到的sub2計算結果="+sum);
    }
    public static void sub1(int x,int y) {
        System.out.println("sub1收到"+x+" "+y);
        int sum=x+y;
        System.out.println("sub1計算結果="+sum);
    }
    public static int sub2(int x, int y,int z) {
        System.out.println("sub2收到"+x+" "+y+" "+z);
        int sum=x+y+z;
        return sum;
    }
}

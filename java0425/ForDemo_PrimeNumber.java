/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class ForDemo_PrimeNumber {
    public static void main(String[] args) {
        int n=18;
        System.out.println("是否為質數"+checkPrime(n));
        printPrimeRange(2, 100);
    }
    public static void printPrimeRange(int begin,int end) {
        for(int i=begin;i<=end;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;             
            }
        }
        return true;
    }
}

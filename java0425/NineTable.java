/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class NineTable {
    public static void main(String[] args) {
        int x;
        for(x=1;x<=9;x++){
            for(int y=2;y<=9;y++){
                System.out.print(y+" * "+x+" = "+x*y+"\t");
            }
            System.out.println();
        }
        
    }
}

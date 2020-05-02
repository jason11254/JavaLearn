/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class ForDemo_Label {
    public static void main(String[] args) {
        lablel1:
        for (int i=0 ;i<5; i++) {
            System.out.println();
            label2:
            for (int j = 0; j < 5; j++) {
                if (j==3) {
                    continue lablel1;
                }
                System.out.print("j="+j+"\t");
            }
        }
    }
}

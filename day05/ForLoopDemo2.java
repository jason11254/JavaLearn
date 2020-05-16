/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(i->{System.out.print(i+" ");});
        System.out.println();
        IntStream.range(1, 10).forEach(i->{System.out.print(i+" ");});
        System.out.println();
        System.out.println("--------------------");
        String[] names={"John","Mary","Tom","Helen","Yuki"};
        IntStream.range(0, names.length).forEach(s->{System.out.print(names[s]+" ");});
        System.out.println();
        IntStream.range(0, names.length)
                .filter(s->names[s].length()>=4)
                .forEach(s->{System.out.print(names[s]+" ");});
        System.out.println();
        for(int i=0;i<names.length;i++){
            if(names[i].length()>=4)
                System.out.print(names[i]+" ");
        }
        System.out.println();
        List<String> arr = Arrays.asList(names);
        arr.stream().filter(s->s.length()>=4).forEach(s->System.out.print(s+" "));
        System.out.println(arr.stream().filter(s->s.length()>=4).count());
    }
}

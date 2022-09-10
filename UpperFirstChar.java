/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.qldiemhsthpt;

import java.util.Scanner;

/**
 *
 * @author anhtuan
 */
public class UpperFirstChar {

    public String UpperFirstChar(String name) {
        //để chuyển đổi name thành một mảng kiểu char
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if (Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if (foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        name = String.valueOf(charArray);

        return name;
    }
    
    String maaaa(String aa){
        Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                UpperFirstChar(name);
        return name;
                
    }
   
    
}

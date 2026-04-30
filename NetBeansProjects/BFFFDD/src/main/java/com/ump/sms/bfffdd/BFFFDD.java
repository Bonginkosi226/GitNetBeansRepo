/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ump.sms.bfffdd;

/**
 *
 * @author sihla
 */
public class BFFFDD {

    public static void main(String[] args) {
        int []num={12,1,5,6,7};
        
        for(int i=0;i<num.length;i++){
            System.out.println(num[i] + " ");
        }
        
        //Find the Total
        int total=0;
        for(int i=0;i<num.length;i++){
            total=total + num[i];
        }
        
        int max=num[0];
        
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The totai is "+total);
        System.out.println("The maximum number is" + max);
        int temp;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                 
                if(num[i]<num[j]){
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        
    }
}

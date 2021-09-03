/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheikhk.beans;

import com.mbengue.beans.Employer;

/**
 *
 * @author tidia
 */
public class TEST {
    public static void main(String[] args) {
         Employer empl=new Employer("fall","serigne",0,0,0,0,0);
         System.out.println(empl.getNom());
    }
}











  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
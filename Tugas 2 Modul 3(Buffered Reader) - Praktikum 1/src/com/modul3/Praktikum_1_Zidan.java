/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul3;

/**
 *
 * @author adham
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Praktikum_1_Zidan {
    public static void main(String[] args) {
        
        BufferedReader data_masuk = new BufferedReader (new InputStreamReader(System.in));
        
        String namaZidan = ""; {
                
            System.out.print("Masukkan nama : "); {
                
                // pengkondisian (jika, lalu)
                try { namaZidan = data_masuk.readLine(); }
                
                catch (IOException e) {
                    System.out.print("Error");
                }
            }
        }
        
        
        String alamatZidan = ""; {
                
            System.out.print("Masukkan Alamat : "); {
                
                // pengkondisian (jika, lalu)
                try { alamatZidan = data_masuk.readLine(); }
                
                catch (IOException e) {
                    System.out.print("Error");
                }
            }
        }
        
        
        String kelasZidan = ""; {
 
        
            System.out.print("Masukkan Kelas : "); {
                
                // pengkondisian (jika, lalu)               
                try { kelasZidan = data_masuk.readLine(); }
                
                catch (IOException e) {
                    System.out.print("Error");
                }
            }
        }
        
        
        System.out.println(namaZidan + " tinggal di " + alamatZidan + " kelas : " + kelasZidan);
    }
}

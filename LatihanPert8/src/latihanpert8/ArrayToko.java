/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert8;

/**
 *
 * @author lenovo
 */

import java.util.Scanner;
public class ArrayToko {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kodeBarang[] = {"001", "002", "003", "004", "005"};
        String namaBarang[] = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int hargaBarang[] = {5000, 6000, 2000, 10000, 1500};

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();

        String kodeInput[] = new String[jumlahItem];
        int jumlahBeli[] = new int[jumlahItem];
        int totalBayar[] = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan Kode: ");
            kodeInput[i] = input.next();

            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    totalBayar[i] = jumlahBeli[i] * hargaBarang[j];
                    break;
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************************");
        System.out.printf("%-3s %-10s %-10s %-6s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah beli", "Jumlah Bayar");

        System.out.println("=====================================================");

        int total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    System.out.printf("%-3d %-10s %-10s %-6d %-12d %-12d\n", 
                        (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], totalBayar[i]);
                    total += totalBayar[i];
                    break;
                }
            }
        }
        System.out.println("=====================================================");
        System.out.println("Total Bayar\t: " + total);
        System.out.println("=====================================================");
        
        input.close();
    }
}


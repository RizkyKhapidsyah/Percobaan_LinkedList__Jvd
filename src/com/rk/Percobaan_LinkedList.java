package com.rk;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Percobaan_LinkedList extends JFrame {
    public static void main(String[] args) {
        new Percobaan_LinkedList();
    }

    LinkedList LL = new LinkedList();

    Percobaan_LinkedList() {
        LL.add("Percobaan Linked List");
        LL.add("Coba Lagi");
        LL.add(10243);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        setTitle("Test LinkedList");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jumlah Elemen          : " + String.valueOf(LL.size()), 10, 50);
        g.drawString("Elemen Ke-1            : " + LL.get(0), 10, 100);
        g.drawString("Elemen Ke-2            : " + LL.get(1), 10, 150);
        g.drawString("Elemen Ke-3            : " + LL.get(2), 10, 200);
        g.drawString("Method getFirst()      : " + LL.getFirst(), 10, 250);
        g.drawString("Method getLast()       : " + LL.getLast(), 10, 300);
        LL.addLast("Terakhir");
        g.drawString("Method getLast()       : " + LL.getLast(), 10, 350);
        LL.remove();
        g.drawString("Jumlah Elemen Sekarang : " + String.valueOf(LL.size()), 10, 400);
    }
}

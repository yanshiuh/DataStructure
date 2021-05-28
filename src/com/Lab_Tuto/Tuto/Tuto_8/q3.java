package com.Lab_Tuto.Tuto.Tuto_8;

import java.util.LinkedList;

public class q3 {

    public static void main(String[] args) {
        LinkedList<Integer>[] adj = new LinkedList[9];
        adj[0].add(2); // A - C
        adj[0].add(3); // A - D
        adj[1].add(3); // B - D
        adj[2].add(4); // C - E
        adj[2].add(5); // C - F
        adj[3].add(4); // D - E
        adj[4].add(6); // E - G
        adj[5].add(7); // F - H
        adj[6].add(7); // G - H
        adj[7].add(8); // H - I
    }
}

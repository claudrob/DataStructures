package datastructures.test;

import my.datastructures.HashTable;

public class HashTableTest {

    public static void main(String[] args) {
        testConstructor();
        testSet();
        testGet();
        testKeys();
    }

    public static void testConstructor(){
        System.out.println("----- TEST: Constructor -----");


            HashTable myHashTable = new HashTable();

            myHashTable.printTable();
    }

    public static void testSet(){
        System.out.println("----- TEST: SET -----");

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */
    }

    public static void testGet(){
        System.out.println("----- TEST: GET -----");


            HashTable myHashTable = new HashTable();

            myHashTable.set("nails", 100);
            myHashTable.set("tile", 50);
            myHashTable.set("lumber", 80);

            System.out.println("Lumber:");
            System.out.println( myHashTable.get("lumber") );

            System.out.println("\nBolts:");
            System.out.println( myHashTable.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

    }

    public static void testKeys(){
        System.out.println("----- TEST: GET -----");
        HashTable myHashTable = new HashTable();

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	[paint, bolts, nails, tile, lumber]

    	*/
    }
}

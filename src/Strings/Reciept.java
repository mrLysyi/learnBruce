package Strings;

import java.util.*;

public class Reciept {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	private Formatter i = new Formatter();
	String str = "%-20s";
	String str2 ="%-20.20s"; 
	

	public void printTitle() {
		f.format(str + " %5s %10s\n", "Item", "Qty", "Price");
		f.format(str + " %5s %10s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format( str2 + "%5d %10.2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format(str + "  %5s %10.2f\n", "Tax", "", total * 0.06);
		f.format(str + "  %5s %10s\n", "", "", "-----");
		f.format(str + "  %5s %10.2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Reciept receipt = new Reciept();
		receipt.printTitle();
		receipt.print("Jack’s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}

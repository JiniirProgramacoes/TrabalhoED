package controller;

import fuction.Ordenar;

public class Principal {

	public static void main(String[] args) {

		Ordenar ord = new Ordenar();
		int x[] = new int[10];
		x[0] = 1;
		x[1] = 5;
		x[2] = 1;
		x[3] = 3;
		x[4] = 9;
		x[5] = 12;
		x[6] = 25;
		x[7] = 2;
		x[8] = 8;
		x[9] = 11;
		
		System.out.println("Ordem inicial do vetor:");
		for(int i = 0; i < 10; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("Insertion Sort:");
		ord.insertionSort(x);
		ord.listarVetor(x);
		
		System.out.println("Heap Sort:");
		ord.heapsort(x);
		ord.listarVetor(x);
	}

}

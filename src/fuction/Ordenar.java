package fuction;

public class Ordenar {

	public void insertionSort(int[] vetor) {
			
		for (int i = 1; i < vetor.length; i++) { 
			int j = i;
			while (j > 0 && vetor[j] < vetor[j-1]) {
				int auxiliar = vetor[j];
				vetor[j] = vetor[j - 1];
				vetor[j - 1] = auxiliar;
				j = j - 1;
			}
				
		}
	}
		
	public void heapsort(int[] vetor){
	    int tamanho = vetor.length;
	        
	    for (int i = tamanho / 2 - 1; i >= 0; i--) {
	    	heapify(vetor, tamanho, i);
	    }
	    for (int i = tamanho - 1; i > 0; i--) {
	        	
	        int auxiliar = vetor[0];
	        vetor[0] = vetor[i];
	        vetor[i] = auxiliar;

	        heapify(vetor, i, 0);
	    }
	}
	 
	    public void heapify(int[] vetor, int tamanho, int i){
	    	int cima = i; 
	        int esquerda = 2 * i + 1; 
	        int direita = 2 * i + 2; 

	        if (esquerda < tamanho && vetor[esquerda] > vetor[cima]) {
	            cima = esquerda;
	        }
	        if (direita < tamanho && vetor[direita] > vetor[cima]) {
	            cima = direita;
	        }
	        
	        if (cima != i) {
	            int troca = vetor[i];
	            vetor[i] = vetor[cima];
	            vetor[cima] = troca;
	            heapify(vetor, tamanho, cima);
	        }
	    }
	    
	    public void listarVetor(int[] vetor) {
	    	int tamanho = vetor.length;
	    	for (int i = 0; i < tamanho; i++) {
	    		System.out.println(vetor[i]+"");
	    	}
	    	System.out.println();
	    }
	}



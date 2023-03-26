package model;

public class pilha {

	no topo;
	
	public pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push (int e ){
		no elemento = new no ();
		elemento.dado = e;
		if (isEmpty()) {
			topo = elemento;
		}else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop () throws Exception{
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar!");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top () throws Exception{
		if (isEmpty()) {
			throw new Exception ("Não há elementos na pilha!");
		}
		return topo.dado;
	}
	
	public int size () {
		int cont = 0;
		if(!isEmpty()){
			no auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null){
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
	
	public void mostra(pilha p) {
		System.out.println("A pilha que ficou é ");
		if(!isEmpty()){
			pilha auxiliar = new pilha();
			auxiliar = p;
			
			int po = auxiliar.size();
			while(auxiliar.isEmpty() == false){
				try {
					System.out.println("A posição "+ po +" da pilha é: "+ auxiliar.pop());
					po--;
				}catch (Exception e ) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

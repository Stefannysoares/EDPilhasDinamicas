package view;
import model.pilha;
public class Principal {

	public static void main(String[] args) {
		pilha p = new pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
		for (int i = 0; i<10; i++) {
			if(i%2 == 0) {
				p.push(i*i);
			}
			else if (i<=5) {
				p.push(i);
			}
			else {
				try {
					int valor = p.pop();
					System.out.println("pop = " + valor);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			try {
				int top = p.top();
				System.out.println("O topo da pilha é: "+ top);
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("O tamanho da pilha é: "+p.size()); 
		p.mostra(p);
	}

}

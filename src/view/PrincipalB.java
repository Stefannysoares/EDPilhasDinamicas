package view;
import model.no;
import model.pilha;
public class PrincipalB {

	public static void main(String[] args) {
		pilha p = new pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
		for (int i = 100; i<115; i++) {
			if (p.isEmpty()) {
				p.push(i+100);	
			}
			else if (p.size() <= 4) {
				p.push(i+50);
			}
			else {
				try {
					System.out.println("POP: " + p.pop());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("O tamanho da pilha é: "+ p.size());
		p.mostra(p);
	}
}

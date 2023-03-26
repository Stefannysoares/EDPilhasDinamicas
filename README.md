# EDPilhasDinamicas
### Exercicio 01 - Atividade Pilhas dinâmicas
Os exercícios de pilha dinâmica estão dividos em três questões, nesse caso uma por repositório. 
Aqui você encontrará duas classes principais ja que o enunciado está dividido em A e B.

### Segue o enunciado da questão:

- Simular o comprtamento das pilhas dinâmicas para os algoritmos abaixo (A simulação deve deixar evidente a pilha que sobrou na memória)

> A)
> Para (i = 0 ; i < 10 ; i++) {
     Se (i % 2 == 0) {
        Push(i * i);
      } Senão {
          Se (i <= 5) {
            Push(i);
      } Senão {
            Pop();
      }
    }
   Top();
}
  Size();

e 

> B)
> Para (i = 100 ; i < 115 ; i++) {
Se (isEmpty()) {
Push(i + 100);
} Senão {
Se (Size() <= 4) {
Push(i + 50);
} Senão {
Pop();
}
}
Top();
}
Size();

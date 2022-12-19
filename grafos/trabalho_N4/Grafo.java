package grafos.trabalho_N4;

import java.util.*;
 
class Grafo
{
    //Função para descobrir o caminho
    //Representando o grafo
    static void caminho(int[][] grafo, int n)
    {
        Vector<Integer> numDeAdj = new Vector<>();
 
        // descobrindo numero de arestas de cada vertice
        for (int i = 0; i < n; i++)
            numDeAdj.add(accumulate(grafo[i], 0));
 
        // Quantos vertices tem arestas Impares
        int comeco = 0, numDeImpar = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            if (numDeAdj.elementAt(i) % 2 == 1)
            {
                numDeImpar++;
                comeco = i;
            }
        }
 
        // caso o numero de vertice com numero impar de arestas seja maior que 2, retornamos "sem solução"
        if (numDeImpar > 2)
        {
            System.out.println("Sem Solucao");
            return;
        }
 
        // Em busca de um caminho, inicializando a pilha e caminho vazio
        Stack<Integer> pilha = new Stack<>();
        Vector<Integer> caminho = new Vector<>();
        int atual = comeco;
 
        // Executamos o loop ate que haja elemento na pilha(pilha) ou na borda atual um vizinho 
        while (!pilha.isEmpty() || accumulate(grafo[atual], 0) != 0)
        {
 
            // caso o no atual nao tenha nenhum vizinho, adicioná-lo ao caminho e à pilha (pilha.pop)
            if (accumulate(grafo[atual], 0) == 0)
            {
                caminho.add(atual);
                atual = pilha.pop();
 
                // Caso o vertice atual tenha ao menos um vizinho, adiciona o vertice atual da pilha
                //remove a aresta entre eles e define o atual para seu vizinho 
            }
            else
            {
                for (int i = 0; i < n; i++)
                {
                    if (grafo[atual][i] == 1)
                    {
                        pilha.add(atual);
                        grafo[atual][i] = 0;
                        grafo[i][atual] = 0;
                        atual = i;
                        break;
                    }
                }
            }
        }
 
        // imprimir caminho 
        for (int ele : caminho)
            System.out.print(ele + " -> ");
        System.out.println(atual);
    }
 
    static int accumulate(int[] arr, int soma)
    {
        for (int i : arr)
            soma += i;
        return soma;
    }
 

    public static void main(String[] args)
    {
 
        // caso 1
        int[][] grafo1 = { { 0, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 0 },
                        { 0, 1, 0, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 1, 0, 0, 0, 0 } };
        int n = grafo1.length;
        caminho(grafo1, n);
 
        // caso 2
        int[][] grafo2 = { { 0, 1, 0, 1, 1 },
                        { 1, 0, 1, 0, 1 },
                        { 0, 1, 0, 1, 1 },
                        { 1, 1, 1, 0, 0 },
                        { 1, 0, 1, 0, 0 } };
        n = grafo2.length;
        caminho(grafo2, n);
 
        // caso 3
        int[][] grafo3 = { { 0, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1 },
                        { 0, 1, 0, 1, 0 },
                        { 0, 1, 1, 0, 1 },
                        { 1, 1, 0, 1, 0 } };
        n = grafo3.length;
        caminho(grafo3, n);
    }
}
 
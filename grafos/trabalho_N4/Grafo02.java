package grafos.trabalho_N4;

import java.io.*;
import java.lang.*;
import java.util.*;
 
class Grafo02{
 
// Fução que checa se temos um caminho hamiltoniano ou nao
static boolean CaminhoHamiltoniano(int adj[][], int N)
{
    boolean dp[][] = new boolean[N][(1 << N)];
 
    // define os dp como verdadeiros
    for(int i = 0; i < N; i++)
        dp[i][(1 << i)] = true;
 
    // interar sobre cada subconjunto de nos
    for(int i = 0; i < (1 << N); i++)
    {
        for(int j = 0; j < N; j++)
        {
             
            // Se os nos forem incluidos no subconjunto atual
            if ((i & (1 << j)) != 0)
            {
 
                // Encontra k vizinho de j tambem no subconjunto atual
                for(int k = 0; k < N; k++)
                {
                     
                    if ((i & (1 << k)) != 0 &&
                         adj[k][j] == 1 && j != k &&
                           dp[k][i ^ (1 << j)])
                    {
                         
                        // Atualiza dp para verdadeiro
                        dp[j][i] = true;
                        break;
                    }
                }
            }
        }
    }
 
    // Percorrer vertices
    for(int i = 0; i < N; i++)
    {
         
        //Existe um caminho hamiltoniano se:
        if (dp[i][(1 << N) - 1])
            return true;
    }
 
    // se nao , retorna false
    return false;
}
 
public static void main(String[] args)
{
    int adj[][] = { { 0, 1, 1, 1, 0 },
                    { 1, 0, 1, 0, 1 },
                    { 1, 1, 0, 1, 1 },
                    { 1, 0, 1, 0, 0 } };
    int N = adj.length;
 
    // Chamando a função
    if (CaminhoHamiltoniano(adj, N))
        System.out.println("Temos um caminho Hamiltoniano");
    else
        System.out.println("Nao temos um caminho Hamiltoniano");
}
}

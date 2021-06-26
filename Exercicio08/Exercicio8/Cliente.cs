using System;
using System.Collections.Generic;

namespace Exercicio8
{
    public class Cliente
    {
        String nome;
        long cpf;
        List<Computador> computador;

        public Cliente(String nome, long cpf, Computador computador)
        {
            this.nome = nome;
            this.cpf = cpf;
            this.computador = new List<Computador>();
            this.computador.Add(computador);
        }

        public void addComputador(Computador computador)
        {
            this.computador.Add(computador);
        }

        public float calculaTotalCompra()
        {
            float total = 0;

            foreach (Computador computador in computador)
            {
                total += computador.preco;
            }
            Console.WriteLine("Compra realizada por: " + nome);
            Console.WriteLine("Valor total: R$" + total);

            return total;
        }
    }
}

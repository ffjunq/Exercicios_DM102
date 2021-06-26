using System;
namespace Exercicio8
{
    public class MemoriaUSB
    {
        String nome;
        int capacidade;

        public MemoriaUSB(String nome, int cap)
        {
            this.nome = nome;
            this.capacidade = cap;
        }

        public override String ToString()
        {
            string memoria = "";
            memoria += $"\nNome: {this.nome}\nCapacidade: {this.capacidade}";
            return memoria;
        }
    }
}

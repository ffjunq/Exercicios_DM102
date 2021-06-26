using System;
namespace Exercicio8
{
    public class SistemaOperacional
    {
        String nome;
        int tipo;

        public SistemaOperacional(String nome, int tipo)
        {
            this.nome = nome;
            this.tipo = tipo;
        }

        public override String ToString()
        {
            string sistemaOperacional = "";
            sistemaOperacional += $"\nNome: {this.nome}\nTipo: {this.tipo}";
            return sistemaOperacional;
        }
    }
}

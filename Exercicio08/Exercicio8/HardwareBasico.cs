using System;
using System.Collections.Generic;

namespace Exercicio8
{
    public class HardwareBasico
    {
        String nome;
        float capacidade;

        public HardwareBasico(String nome, float capacidade)
        {
            this.capacidade = capacidade;
            this.nome = nome;
        }

        public override String ToString()
        {
            string hardware = "";
            hardware = $"Nome: {this.nome}\nCapacidade: {this.capacidade}";
            return hardware;
        }
    }
}

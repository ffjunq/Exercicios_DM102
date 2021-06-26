using HouseSystem;
using System;
using System.Collections.Generic;

namespace Exercicio9
{
    class Program
    {
        static void Main(string[] args)
        {
            float IPTU = 0.0f;

            List<Banheiro> banheiros;
            List<Quarto> quartos;
            banheiros = new List<Banheiro>();
            quartos = new List<Quarto>();

            Cozinha cozinha1 = new Cozinha(true, 2, 3.00f, 1.00f);
            
            Banheiro banheiro1 = new Banheiro(true, true, true, 2.50f, 1.50f);
            Banheiro banheiro2 = new Banheiro(true, false, true, 1.65f, 2.00f);
            banheiros.Add(banheiro1);
            banheiros.Add(banheiro2);

            Sala sala1 = new Sala(true, 2.00f, 3.00f);

            Quarto quarto1 = new Quarto(true, true, 5.00f, 3.00f);
            Quarto quarto2 = new Quarto(false, false, 3.00f, 2.00f);
            quartos.Add(quarto1);
            quartos.Add(quarto2);

            Casa casa1 = new Casa("Rua João com braço, n 57 - St. Rutz", "João", 2500.00f, cozinha1, banheiros, sala1, quartos);

            casa1.mostraInfos();

            IPTU = casa1.calculaIPTU();
            Console.WriteLine($"\n\nValor IPTU: R${IPTU}");

        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Casa : IContabil, IDivulga
    {
        String endereco;
        String proprietario;
        float valor;

        Cozinha cozinha;
        List<Banheiro> banheiros;
        Sala sala;
        List<Quarto> quartos;

        public Casa(string endereco, string proprietario, float valor, Cozinha cozinha, List<Banheiro> banheiros, Sala sala, List<Quarto> quartos)
        {
            this.endereco = endereco;
            this.proprietario = proprietario;
            this.valor = valor;
            this.cozinha = cozinha;
            this.banheiros = banheiros;
            this.sala = sala;
            this.quartos = quartos;
        }

        public float calculaIPTU()
        {
            return (valor * 0.01f) + 300.0f;
        }

        public void mostraInfos()
        {
            Console.WriteLine(this.ToString());
        }

        public override string ToString()
        {
            String informacoesCasa = "";
            informacoesCasa += $"Casa localizada em: {endereco}; \nProprietário: {proprietario}; \nValor: R${valor};";
            informacoesCasa += $"\nPossui {this.cozinha.numArmarios} armário(s) e ";
            if(this.cozinha.temGeladeira)
            {
                informacoesCasa += $"possui geladeira!";
            }
            else
            {
                informacoesCasa += $"não possui geladeira!";
            }
            if (this.banheiros.Count > 0)
            {
               for (int i = 0; i < banheiros.Count; i++)
               {
                   Banheiro banheiro = banheiros[i];
                    informacoesCasa += $"\nBanheiro {i + 1} ";
                    if (banheiro.temEspelho)
                    {
                        informacoesCasa += "possui espelho, ";
                    }
                    else
                    {
                        informacoesCasa += "não possui espelho, ";
                    }

                    if (banheiro.temVasoSanitario)
                    {
                        informacoesCasa += "possui vaso sanitário e ";
                    }
                    else
                    {
                        informacoesCasa += "não possui vaso sanitário e";
                    }

                    if (banheiro.temChuveiro)
                    {
                        informacoesCasa += "possui chuveiro!";
                    }
                    else
                    {
                        informacoesCasa += "não possui chuveiro!";
                    }
               }
            }

            if(this.sala.temPainel)
            {
                informacoesCasa += "\nSala possui painel!";
            }
            else
            {
                informacoesCasa += "\nSala possui painel!";
            }

            if (this.quartos.Count > 0)
            {
                for (int i = 0; i < quartos.Count; i++)
                {
                    Quarto quarto = quartos[i];
                    informacoesCasa += $"\nQuarto {i + 1} ";
                    if (quarto.temArmarioEmbutido)
                    {
                        informacoesCasa += "possui armário embutido e ";
                    }
                    else
                    {
                        informacoesCasa += "não possui armário embutido e ";
                    }

                    if (quarto.temSuite)
                    {
                        informacoesCasa += "o quarto é suíte!";
                    }
                    else
                    {
                        informacoesCasa += "o quarto não é suíte!";
                    }

                }
            }

            return informacoesCasa;
        }
    }
}

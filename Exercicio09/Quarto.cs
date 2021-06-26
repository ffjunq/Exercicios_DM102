using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Quarto : Comodo
    {
        public bool temArmarioEmbutido;
        public bool temSuite;

        public Quarto(bool temArmarioEmbutido, bool temSuite, float largura, float comprimento)
        {
            this.temArmarioEmbutido = temArmarioEmbutido;
            this.temSuite = temSuite;
            this.largura = largura;
            this.comprimento = comprimento;
        }
    }
}

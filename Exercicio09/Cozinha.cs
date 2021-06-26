using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Cozinha : Comodo
    {
        public bool temGeladeira;
        public int numArmarios;

        public Cozinha(bool temGeladeira, int numArmarios, float largura, float comprimento)
        {
            this.temGeladeira = temGeladeira;
            this.numArmarios = numArmarios;
            this.largura = largura;
            this.comprimento = comprimento;
        }
    }
}

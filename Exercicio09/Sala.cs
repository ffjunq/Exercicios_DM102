using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Sala : Comodo
    {
        public bool temPainel;

        public Sala(bool temPainel, float largura, float comprimento)
        {
            this.temPainel = temPainel;
            this.largura = largura;
            this.comprimento = comprimento;
        }
    }
}

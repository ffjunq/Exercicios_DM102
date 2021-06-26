using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Banheiro : Comodo
    {
        public bool temEspelho;
        public bool temChuveiro;
        public bool temVasoSanitario;

        public Banheiro(bool temEspelho, bool temChuveiro, bool temVasoSanitario, float largura, float comprimento)
        {
            this.temEspelho = temEspelho;
            this.temChuveiro = temChuveiro;
            this.temVasoSanitario = temVasoSanitario;
            this.largura = largura;
            this.comprimento = comprimento;
        }
    }
}

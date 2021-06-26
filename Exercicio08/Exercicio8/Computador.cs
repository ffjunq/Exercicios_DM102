using System;
using System.Collections.Generic;

namespace Exercicio8
{
    public class Computador
    {
        String marca;
        public float preco;
        SistemaOperacional sistemaOperacional;
        List<HardwareBasico> hardware;
        MemoriaUSB musb;

        public void mostraPCConfig()
        {
            Console.WriteLine("Marca do computador: " + marca);
            Console.WriteLine("Sistema Operacional: " + sistemaOperacional);
            if(musb != null)
            {
                Console.WriteLine("Memória USB: " + musb);
            }
            Console.WriteLine("Hardwares: ");
            foreach (HardwareBasico hardware in hardware)
            {
                Console.WriteLine(hardware);
            }
        }

        public void addMemoria(MemoriaUSB musb)
        {
            this.musb = musb;
        }

        public void addHardware(HardwareBasico hardware)
        {
            this.hardware.Add(hardware);
        }

        public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico hardware)
        {
            this.marca = marca;
            this.preco = preco;
            this.sistemaOperacional = sistemaOperacional;
            this.hardware = new List<HardwareBasico>();
            this.hardware.Add(hardware);
        }
    }
}

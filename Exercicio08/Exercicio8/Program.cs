using System;

namespace Exercicio8
{
    class Program
    {
        static void Main(string[] args)
        {
            SistemaOperacional sistemaOperacional1 = new SistemaOperacional("Windows 10", 64);
            MemoriaUSB memoria1 = new MemoriaUSB("ssd", 500);
            HardwareBasico hardware1 = new HardwareBasico("Core i3", 1600);
            HardwareBasico hardware2 = new HardwareBasico("AMD", 1200);
            

            Computador computador1 = new Computador("Dell", 18000.0f, sistemaOperacional1, hardware1);
            computador1.addHardware(hardware2);
            computador1.addMemoria(memoria1);
            computador1.mostraPCConfig();

            SistemaOperacional sistemaOperacional2 = new SistemaOperacional("MAC OS", 64);
            MemoriaUSB memoria2 = new MemoriaUSB("ssd", 500);
            HardwareBasico hardware3 = new HardwareBasico("M1", 1600);

            Computador computador2 = new Computador("Apple", 18000.0f, sistemaOperacional2, hardware3);
            computador2.addMemoria(memoria2);
            computador2.mostraPCConfig();

            Cliente cliente = new Cliente("João sem braço",123123123,computador1);
            cliente.addComputador(computador2);

            cliente.calculaTotalCompra();
        }
    }
}

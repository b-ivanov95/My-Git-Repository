using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.LaptopShop
{
    class LaptopShop
    {
        
            static void Main()
        {
            Laptop temp1 = new Laptop("Lenovo Y50", "Lenovo", "Intel Core i7-4770k (quad-core, 2.20 - 3.20 GHz)",
                8, "GeForce GTX870m", "256GB SSD", "15.6\"  – 3200 x 1800(QHD +)",
                new Battery("Li-Ion, 6-cells, 3600 mAh", 6.0), 1800.00m);
            Laptop temp2 = new Laptop("Dell", 799.99m);
            Console.WriteLine(temp1);
            Console.WriteLine(temp2);
        }
        
    }
}

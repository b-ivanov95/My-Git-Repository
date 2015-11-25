using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookShop
{
    class Program
    {
        static void Main(string[] args)
        {
            Book sashko = new Book("Pod Igoto","Ivan Vazov", 8.50);
            Console.WriteLine(sashko);
        }
    }
}

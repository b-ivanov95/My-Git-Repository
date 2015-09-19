using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CategorizeNumbers
{
    class CategorizeNumbers
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            double[] numbers = input.Select(e => double.Parse(e)).ToArray();
            var listOfDoubles = new List<double>();
            var listOfInts = new List<int>();


            foreach (var number in numbers)
            {
                string ss = number.ToString();
                    
                if (!ss.Contains("."))
                {
                    listOfInts.Add((int)number);
                }
                else
                {
                    listOfDoubles.Add(number);
                }
            }


            double doublesMin = listOfDoubles.Min();
            double doubleMax = listOfDoubles.Max();
            double doubleSum = listOfDoubles.Sum();
            double doubleAvg = listOfDoubles.Average();
            int intMin = listOfInts.Min();
            int intMax = listOfInts.Max();
            int intSum = listOfInts.Sum();
            int intAvg = (int)listOfInts.Average();
            Console.WriteLine("[" + string.Join(", ",listOfDoubles) + "] -> min: {0}, max: {1}, sum: {2}, avg: {3:F2}",doublesMin,doubleMax,doubleSum,doubleAvg);
            Console.WriteLine();
            Console.WriteLine("[" + string.Join(", ", listOfInts) + "] -> min: {0}, max: {1}, sum: {2}, avg: {3:F2}", intMin, intMax, intSum, intAvg);
        }
    }
}

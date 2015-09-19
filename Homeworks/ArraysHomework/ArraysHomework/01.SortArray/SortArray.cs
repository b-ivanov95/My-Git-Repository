using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.SortArray
{
    class SortArray
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
             string sorted = SortMyArray(input);
             Console.WriteLine(sorted);

        }

        private static string SortMyArray(string[] input)
        {
           int [] intArray = new int [input.Length];
            for (int i = 0; i < input.Length; i++)
			{
                intArray[i] = int.Parse(input[i]);
			}
            Array.Sort(intArray);

            string output = string.Join(" ", intArray);
            return output;
        }
    }
}

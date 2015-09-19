using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.SelectionSort
{
    class SelectionSort
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            string sorted = SortSelection(input);
            Console.WriteLine(sorted);
        }

        private static string SortSelection(string[] input)
        {
            int[] intArray = new int[input.Length];
            for (int i = 0; i < input.Length; i++)
            {
                intArray[i] = int.Parse(input[i]);
            }

            for (int i = 0; i < intArray.Length-1; i++)
            {
                
                for (int j = i+1; j < intArray.Length; j++)
                {
                   
                    if (intArray[i] > intArray[j])
                    {
                        int temp = intArray[i];
                        intArray[i] = intArray[j];
                        intArray[j] = temp;

                    }
                }
            }

            string output = string.Join(" ",intArray);
            return output;
        }
    }
}

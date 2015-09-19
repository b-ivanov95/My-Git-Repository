using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.ComandInterpreter
{
    class CommandInterpreter
    {
        static void Main(string[] args)
        {

            string input = Console.ReadLine();
            char[] whitespace = new char[] { ' ' };
            string [] inputArray = input.Split(whitespace,StringSplitOptions.RemoveEmptyEntries);
            string command = null;

             do
                {

                    command = Console.ReadLine();
                    string[] commandArray = command.Split(' ');

                    try { 
                    if (commandArray[0] == "reverse")
                    {
                        int startIndex = int.Parse(commandArray[2]);
                        int length = int.Parse(commandArray[4]);
                        Array.Reverse(inputArray, startIndex, length);
                    } }
                        catch {
                            Console.WriteLine("Invalid input parameters.");
                        }
                    try
                    {
                        if (commandArray[0] == "sort")
                        {
                            int startIndex = int.Parse(commandArray[2]);
                            int length = int.Parse(commandArray[4]);
                            Array.Sort(inputArray, startIndex, length);
                        }
                    }

                    catch
                    {
                        Console.WriteLine("Invalid input parameters.");
                    }

                    try
                    {
                        if (commandArray[0] == "rollLeft")
                        {
                            RollLeft(inputArray, int.Parse(commandArray[1]));
                        }
                    }

                    catch
                    {
                        Console.WriteLine("Invalid input parameters.");
                    }


                    try
                    {
                        if (commandArray[0] == "rollRight")
                        {
                            RollRight(inputArray, int.Parse(commandArray[1]));
                        }
                    }
                    catch 
                    {
                        Console.WriteLine("Invalid input parameters.");
                    }

                        if (commandArray[0] != "end" && commandArray[0] != "rollRight" && commandArray[0] != "rollLeft" && commandArray[0] != "sort" && commandArray[0] != "reverse")
                        {
                            Console.WriteLine("Invalid input parameters.");
                        }

                }
                while (command != "end");
            
           

          
            
            Console.WriteLine("[" + string.Join(", ",inputArray) + "]");
          


        }

        public static string[] RollLeft (string[] inputArray, int count)
        {


            for (int j = 0; j < count; j++)
            {
                string temp = inputArray[0];
                for (int i = 0; i < inputArray.Length; i++)
                {
                    if (i < inputArray.Length - 1)
                    {
                        inputArray[i] = inputArray[i + 1];
                    }
                    else if (i == inputArray.Length - 1)
                    {
                        inputArray[i] = temp;
                    }
                }

            }


            return inputArray;
        }

        public static string[] RollRight(string[] inputArray, int count)
        {


            for (int j = 0; j < count; j++)
            {
                string temp = inputArray[inputArray.Length-1];
                for (int i = inputArray.Length-1; i >= 0; i--)
                {
                    
                    if (i > 0)
                    {
                        inputArray[i] = inputArray[i-1];
                    }
                    else if (i == 0)
                    {
                        inputArray[i] = temp ;
                    }
                }

            }


            return inputArray;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace zad1
{
    class Program
    {
        static void Main(string[] args)
        {

            string elements = Console.ReadLine();

            string[] elem = new string[elements.Length];

            for (int i = 0; i < elem.Length; i++)
            {
                elem[i] = elements[i].ToString();
            }

                

            string[] vectror = new string[elements.Length];
            bool[] used = new bool[elements.Length];


            Gen(0, vectror, elem, used);


            Console.ReadLine();


        }

        static void Gen(int index, string[] vector, string[] elements, bool[] used)
        {
            if (index == vector.Length)
            {
                Console.WriteLine(String.Join(" ", vector));
            }
            else
            {
                for (int i = 0; i < elements.Length; i++)
                {
                    if (used[i] == false)
                    {
                        used[i] = true;
                        vector[index] = elements[i];
                        Gen(index + 1, vector, elements, used);
                        used[i] = false;
                    }
                }
            }
        }
    }
}

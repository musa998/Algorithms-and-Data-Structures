using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SubsetSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int k = int.Parse(Console.ReadLine());

            
            int[] vector = new int[n];
            bool[] used = new bool[n];


            Variations(0, n, k, vector, used);
            Console.ReadLine();

        }
        public static void Variations(int index, int n, int k, int[] vector,
            bool[] used)
        {

            if (index == vector.Length)
            {
                if (vector.Sum() == k)
                {
                    Console.WriteLine(String.Join("+", vector));
                }
            }
            else
            {
                for (int i = 1; i < k; i++)
                {
                    for (int j = index; j < vector.Length; j++)
                    {
                        if (used[j] == false)
                        {
                            used[j] = true;
                            vector[j] = i;
                            Variations(index + 1,  n, k, vector, used);
                            used[j] = false;
                        }
                    }
                }
               

               // Variations(index - 1, start+1 , n, k, vector);
            }


        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Diamonts
{
    class Program
    {
        static int count = 0;
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] arr = new int[n+1];
            for (int i = 0; i <= n; i++)
            {
                arr[i] = i;
            }
            int[] vector = new int[2];

            Gen(0, 0, vector, arr);
            Console.WriteLine(count*n);

            Console.ReadLine();
        }

        private static void Gen(int index, int start, int[] vector, int[] arr)
        {
            if (index == vector.Length)
            {
                count++;
                Console.WriteLine(String.Join(" ", vector));
            }
            else
            {
                for (int i = start; i < arr.Length; i++)
                {
                    vector[index] = i;
                    Gen(index + 1, i , vector, arr);
                }
            }
        }
    }
}

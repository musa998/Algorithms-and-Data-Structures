using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpiralFillMatrix
{
    class Program
    {
        static void Main(string[] args)
        {
            int n;
            do
            {
                n = int.Parse(Console.ReadLine());

            } while (n % 2 == 0);


            int[,] array = new int[n, n];


            FillArray(array, n);

            PrintMatrix(array, n);



            Console.ReadLine();

        }
        public static void PrintMatrix(int[,] matrix, int n)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    Console.Write("{0,3}", matrix[i, j]);
                }
                Console.WriteLine();
            }
        }
        public static void FillArray(int[,] arr, int n)
        {
            int direction = 0;
            int step = 1;
            int stepPos = 0;
            int stepChange = 0;

            int row = n / 2;
            int col = n / 2;

            for (int i = 1; i <= n * n; i++)
            {
                arr[row, col] = i;
                if (stepPos < step)
                {
                    stepPos++;
                }
                else
                {
                    stepPos = 1;
                    if (stepChange == 1)
                    {
                        step++;
                    }
                    stepChange = (stepChange + 1) % 2;
                    direction = (direction + 1) % 4;
                }
                switch (direction)
                {
                    case 0: row--; break;  
                    case 1: col++; break;  
                    case 2: row++; break;  
                    case 3: col--; break;  
                }
            }

        }
    }
}

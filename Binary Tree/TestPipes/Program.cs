using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestPipes
{
    class Program
    {
        static void Main(string[] args)
        {
            double liters = int.Parse(Console.ReadLine());
            int numPipes = int.Parse(Console.ReadLine());



            BTree tree = new BTree();
            int numIterations = numPipes / 2;

            for (int i = 0; i < numIterations; i++)
            {
                int[] cmdArgs = Console.ReadLine().Split(' ')
                    .Select(int.Parse)
                    .ToArray();
                if (i == 0)
                {
                    BNode root = new BNode(cmdArgs[0], liters, 100, 1);
                    tree.root = root;
                }
                tree.Add(cmdArgs, i+1);
               // tree.Add(cmdArgs);
            }

            tree.PrintTree();
            Console.ReadLine();
        }
    }
}

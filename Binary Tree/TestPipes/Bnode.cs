using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestPipes
{
   public class BNode
    {
        public BNode LeftChild { get; set; }
        public BNode RightChild { get; set; }
        public int Value { get; set; }
        public int Procenteges { get; set; }
        public double Liters { get; set; }

        public double GetLiters()
        {
            return Procenteges / 100.0 * Liters;
        }

        public BNode(int value, double liters, int percenteges, int sortValue)
        {
            this.Procenteges = percenteges;
            this.Value = value;
            this.Liters = percenteges / (double)100.0 * liters;
        }


        public bool SearchLeft(BNode node, int s, int[] cmdArgs,ref BNode t1,ref BNode t2,ref BNode sNode)
        {
            if (node != null)
            {
                t1 = new BNode(cmdArgs[1], node.Liters, cmdArgs[2], cmdArgs[1]);
                t2 = new BNode(cmdArgs[3], node.Liters, cmdArgs[4], cmdArgs[3]);
            }
            if (node == null)
                return false;

            if (node.Value == s)
            {
                sNode = node;
                return true;
            }
            else 
            {
                return SearchLeft(node.LeftChild, s, cmdArgs,ref t1,ref t2,ref sNode);
            }
        }
        public bool SearchRight(BNode node, int s, int[] cmdArgs,ref BNode t1,ref BNode t2, ref BNode sNode)
        {
            if (node != null)
            {
                t1 = new BNode(cmdArgs[1], node.Liters, cmdArgs[2], cmdArgs[1]);
                t2 = new BNode(cmdArgs[3], node.Liters, cmdArgs[4], cmdArgs[3]);
            }
            if (node == null)
                return false;

            if (node.Value == s)
            {
                sNode = node;
                return true;
            }
            else
            {
                return SearchRight(node.RightChild, s, cmdArgs,ref t1,ref t2, ref sNode);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestPipes
{
    class BTree
    {
        public BNode root;
        public BTree()
        {

        }
        private void AddNode(int[] cmdArgs, BNode node, int i)
        {
            BNode sNode = null;
            BNode n1 = null;
            BNode n2 = null;
            BNode t1 = null;
            BNode t2 = null;
            if (node.SearchLeft(node, cmdArgs[0], cmdArgs, ref t1, ref t2, ref sNode)
                || node.SearchRight(node, cmdArgs[0], cmdArgs, ref t1, ref t2, ref sNode))
            {
                node = sNode;
                n1 = t1;
                n2 = t2;
                AddChild(n1, n2, node);
            }
        }
        public void Add(int[] cmdArgs, int i)
        {
            AddNode(cmdArgs, root, i);
        }
        private void PrintTree(BNode node)
        {
            if (node == null)
            {
                return;
            }

            PrintTree(node.LeftChild);
            if (node.LeftChild == null && node.RightChild == null)
            {
                Console.Write(node.Value);
                Console.WriteLine(" - " + node.Liters);
            }
            PrintTree(node.RightChild);
        }
        public void AddChild(BNode n1, BNode n2, BNode node)
        {
            node.LeftChild = n1;
            node.RightChild = n2;
        }
        private bool Search(int s)
        {
            return false;
        }

        public void PrintTree()
        {
            PrintTree(root);
        }
    }
}

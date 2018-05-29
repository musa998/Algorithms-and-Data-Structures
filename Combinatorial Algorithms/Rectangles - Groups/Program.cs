using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test
{
    class Program
    {

        static int currentGroup = 0;
        static List<List<Rect>> area = new List<List<Rect>>();

        static void Main(string[] args)
        {

            int numRectangles = int.Parse(Console.ReadLine());
            List<Rect> list = new List<Rect>();


            for (int i = 0; i < numRectangles; i++)
            {
                int[] input = Console.ReadLine().Split(' ')
                    .Select(int.Parse)
                    .ToArray();
                Rect rectangle = new Rect(input[0], input[1], input[2], input[3]);
                list.Add(rectangle);
            }
            bool[] used = new bool[list.Count];

            
            MakeGroups(0, list, used);
            Console.WriteLine(area.Count);
            CalculateArea(area);
           

            Console.ReadLine();

        }

        private static void RemoveEqualElements(List<List<Rect>> area)
        {
            foreach (var list in area)
            {
               list.Distinct().ToList();
            }
        }

        private static void CalculateArea(List<List<Rect>> area)
        {
            int mainSum = 0;
            int currentSum = 0;
            int currentMainSum = 0;
            int maxSum = 0;
            for (int i = 0; i < area.Count; i++)
            {
                for (int j = 0; j < area[i].Count; j++)
                {
                    mainSum += area[i][j].Area();
                    currentMainSum += area[i][j].Area();
                }
                currentSum = currentMainSum;
                currentMainSum = 0;
                if (currentSum > maxSum)
                {
                    maxSum = currentSum;
                }
            }
            Console.WriteLine("Sum of all rectangles: " +mainSum);
            Console.WriteLine("Max-group-Area: " + maxSum);
        }

        static void MakeGroups(int index, List<Rect> list, bool[] used)
        {

            if (currentGroup >= area.Count) area.Add(new List<Rect>());

            if (index == list.Count) { } /// list.Count

            else //if (index > 0 || index == 0) // else
            {
                for (int j = index; j < list.Count; j++)
                {
                    if (area[currentGroup].Count > 0)
                    {
                        if (j == index)
                        {
                            continue;
                        }
                        int start = list[index].x1; // j-1
                        int end = list[index].x2; // j-1

                        bool onlyOneTopFirst = false;
                        if (list[j - 1].y2 >= 1)
                        {
                            onlyOneTopFirst = (list[j].x1 == end && list[j].y2 >= 1) ||
                           (list[j].x2 == start && list[j].y2 >= 1); /// trqbva da vurne true kogato sa v edna oblast
                        }

                        bool crossOne = (list[j].x1 >= start && list[j].x2 <= end) ||
                            ((list[j].x1 <= start && list[j].x2 >= end));

                        // pri otricatelno y2
                        bool onlyOneTopFirstNegative = (list[j].x1 == end && list[j].y2 >= -1) ||
                           (list[j].x2 == start && list[j].y2 >= -1); /// trqbva da vurne true kogato sa v edna oblast

                        if (onlyOneTopFirst || crossOne || onlyOneTopFirstNegative)
                        {
                            
                            if (used[j] == true || used[index] == true)  // used[index] && used[j] == false)
                            {
                                if (used[index] == false)
                                {
                                    area[currentGroup].Add(list[index]);
                                    used[index] = true;
                                    continue;
                                }
                                area[currentGroup].Add(list[j]);
                                used[j] = true;
                            }
                        }
                    }
                    else
                    {
                        //j--;
                        area[currentGroup].Add(list[j]);
                        used[j] = true;
                    }
                }
                //  if (area[currentGroup].Count <= 1) currentGroup++;
                MakeGroups(index + 1, list, used);
                //////////////////////////////////////////
                bool hasMoreGroups = false;
                int indexOfLeftElements = 0;
                for (int i = 0; i < used.Length; i++)
                {
                    if (used[i] == false)
                    {
                        hasMoreGroups = true;
                        indexOfLeftElements = i;
                        break;
                    }
                }
                if (hasMoreGroups)
                {
                    currentGroup++;
                    MakeGroups(indexOfLeftElements, list, used);
                }
            }
        }
    }
}

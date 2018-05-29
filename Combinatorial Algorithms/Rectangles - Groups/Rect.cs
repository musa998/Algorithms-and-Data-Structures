using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test
{
    class Rect
    {
        public int x1;
        public int x2;
        //public int x3;
        //public int x4;

        public int y1;
        public int y2;
        //public int y3;
        //public int y4;

        //public decimal s;

        //public int a;
        //public int b;
        //private int v1;
        //private int v2;
        //private int v3;
        //private int v4;
        public int Area()
        {
            int a = this.x2 - this.x1;
            int b = this.y1 +Math.Abs(this.y2);
            return a * b;
        }


        public Rect(int x1, int y1, int x2, int y2)
        {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }
}

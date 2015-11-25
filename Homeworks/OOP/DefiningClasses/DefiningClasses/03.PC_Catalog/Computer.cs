using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _03.PC_Catalog
{
   public class Computer
    {
        private string name;
        List<Component> components;
        private double price = 0.0;

        public Computer(string name, List<Component> components)
        {
            this.Name = name;
            this.Components = components;
        }

        public string Name
        {
            get { return this.name; }
            set
            {
                if (String.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Should be not empty");
                }
                this.name = value;
            }
        }

        public List<Component> Components
        {
            get { return this.components; }
            set
            {
                if (value == null)
                {
                    throw new ArgumentException("Must add one component to run this program!");
                }
                this.components = value;
            }
        }

        private double CalculatePrice()
        {
            foreach (var component in this.components)
            {
                this.price += component.ComponentPrice;
            }
            return this.price;
        }

        public override string ToString()
        {
            string output = "Computer name: " + this.name + "\n\n";
            foreach (var component in this.components)
            {
                output += component.ToString();
            }
            double prc = CalculatePrice();
            output += "Computer price: " + prc + " lv.\n-----------------------------\n";
            return output;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _03.PC_Catalog
{
     public class Component
    {
        private string componentName;
        private string componentDescription;
        private double componentPrice;

        public Component(string componentName, double componentPrice, string componentDescription = null)
        {
            this.ComponentName = componentName;
            this.ComponentPrice = componentPrice;
            this.ComponentDescription = componentDescription;
        }

        public string ComponentName
        {
            get { return this.componentName; }
            set
            {
                if (String.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Component name needed");
                }
                this.componentName = value;
            }
        }

        public string ComponentDescription
        {
            get { return this.componentDescription; }
            set { this.componentDescription = value; }
        }

        public double ComponentPrice
        {
            get { return this.componentPrice; }
            set
            {
                if (value <= 0 || Double.IsNaN(value))
                {
                    throw new ArgumentException("Price must be positive");
                }
                this.componentPrice = value;
            }
        }

        public override string ToString()
        {
            string output = "Component name: " + this.componentName + "\n";
            if (!String.IsNullOrEmpty(this.componentDescription))
            {
                output += "Component desc.: " + this.componentDescription + "\n";
            }
            else
            {
                output += "Component desc.: (no description)" + "\n";
            }
            output += "Component preice: " + this.componentPrice + "lv\n\n";
            return output;
        }

    }
}

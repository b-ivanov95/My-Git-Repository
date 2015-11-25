using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _02.LaptopShop
{
    class Laptop
    {
        private string model;
        private string manufacturer;
        private string processor;
        private int ram;
        private string graphicsCard;
        private string hdd;
        private string screen;
        private Battery battery;
        private decimal price;

        public Laptop(string model, decimal price)
        {
            Model = model;
            Price = price;
        }

        public Laptop(string model, string manufacturer, string processor, int ram,
                        string graphicsCard, string hdd, string screen, Battery battery, decimal price)
            : this(model, price)
        {
            this.Model = model;
            this.Manufacturer = manufacturer;
            this.Processor = processor;
            this.Ram = ram;
            this.GraphicsCard = graphicsCard;
            this.Hdd = hdd;
            this.Screen = screen;
            this.battery = battery;
        }

        public string Model
        {
            get { return this.model; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Model cannot be empty: ");
                }
                this.model = value;
            }
        }
        public string Manufacturer
        {
            get { return this.model; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Manufacturer cannot be empty: ");
                }
                this.manufacturer = value;
            }
        }
        public string Processor
        {
            get { return this.processor; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Processor cannot be empty: ");
                }
                this.processor = value;
            }
        }
        public int Ram
        {
            get { return this.ram; }
            set
            {
                if (value < 0)
                {
                    throw new ArgumentException("Ram cannont be negative: ");
                }
                this.ram = value;
            }
        }
        public string GraphicsCard
        {
            get { return this.graphicsCard; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Graphics Card cannot be empty");
                }
                this.graphicsCard = value;
            }
        }
        public string Hdd
        {
            get { return this.hdd; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new AggregateException("Hdd cannot be empty: ");
                }
                this.hdd = value;
            }
        }
        public string Screen
        {
            get { return this.screen; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("Screen cannot be empty: ");
                }
                this.screen = value;
            }
        }
        public string Battery
        {
            get { return Battery; }
            set
            {
                Battery = value;
            }
        }
        public decimal Price
        {
            get { return this.price; }
            set
            {
                if (value < 0)
                {
                    throw new ArgumentException("Price cannot be emptu or negative: ");
                }
                this.price = value;
            }
        }
        public override string ToString()
        {
            string output = "Model: " + model + "\n";

            if (manufacturer == null)
            {
                output += "Price: " + price + " lv.\n";
            }
            else
            {
                output += "Manufacturer: " + manufacturer + "\n";
                output += "Processor: " + processor + "\n";
                output += "RAM: " + ram + "GB\n";
                output += "Graphics Card: " + graphicsCard + "\n";
                output += "HDD: " + hdd + "\n";
                output += "Screen: " + screen + "\n";
                output += battery;
                output += "Price: " + price + " lv.\n";
            }

            return output;
        }
    }
}

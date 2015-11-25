using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _02.LaptopShop
{
    class Battery
    {
        private string battery;
        private double batteryLife;

        public Battery(string battery = null, double batteryLife = 0)
        {
            this.Batt = battery;
            this.BatteryLife = batteryLife;
        }

        public string Batt
        {
            get { return this.battery; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    this.battery = null;
                }
                this.battery = value;
            }
        }
        public double BatteryLife
        {
            get { return this.batteryLife; }
            set
            {
                if (value < 0)
                {
                    throw new ArgumentException("Battery Life cannot be negative: ");
                }
                this.batteryLife = value;
            }
        }
        public override string ToString()
        {
            string battery = "Battery: " + this.battery + "\n";
            battery += "Battery Life: " + this.batteryLife + " hours \n";
            return battery;
        }
    }
}

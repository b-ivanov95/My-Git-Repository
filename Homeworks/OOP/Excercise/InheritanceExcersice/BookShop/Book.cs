using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace BookShop
{
    public class Book
    {
        private string title;
        private string author;
        private double price;

        public Book(string title, string author, double price)
        {
            this.Title = title;
            this.Author = author;
            this.Price = price;
        }

        protected string Title
        {
            get { return this.title; }

            set
            {
                if (!String.IsNullOrEmpty(value))
                {
                    this.title = value;

                }
                else
                {
                    throw new Exception("Invalid book title");
                }
            }
        }

        protected string Author
        {
            get { return this.title; }

            set
            {
                if (!String.IsNullOrEmpty(value))
                {
                    this.title = value;

                }
                else
                {
                    throw new Exception("Invalid Author name");
                }
            }
        }

        protected double Price
        {
            get { return this.price; }

            set
            {
                if (value >= 0)
                {
                    this.price = value;
                }
                else
                {
                    throw new Exception("Invalid Price");
                }
            } }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.AppendFormat("-Type: {0}{1}", this.GetType().Name, Environment.NewLine);
            sb.AppendFormat("-Title: {0}{1}", this.Title, Environment.NewLine);
            sb.AppendFormat("-Author: {0}{1}", this.Author, Environment.NewLine);
            sb.AppendFormat("-Price: {0:F2}{1}", this.Price, Environment.NewLine);
            return sb.ToString();
        }
    }
}

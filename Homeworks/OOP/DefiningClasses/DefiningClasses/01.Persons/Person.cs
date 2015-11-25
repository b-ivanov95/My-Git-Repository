using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Persons
{
    class Person
    {
        private string name;
        private string email;
        private int age;

        public Person(string name, int age, string email)
        {
            this.Name = name;
            this.Age = age;
            this.Email = email;
        }

        public Person(string name, int age)
            : this(name, age, null)
        {
        }

        public string Name
        {
            get { return this.name; }
            set
            {
                if (value != String.Empty)
                {
                    this.name = value;
                }
                else
                {
                    throw new Exception("Incorrect name");
                }
            }
        }

        public int Age
        {
            get { return this.age; }

            set
            {
                if (value < 100 && value > 1)
                {
                    this.age = value;
                }
                else
                {
                    throw new Exception("Invalid age");
                }
            }
        }

        public string Email
        {
            get { return this.email; }

            set
            {
                if (value == null || value.Contains("@"))
                {
                    this.email = value;
                }
                else
                {
                    throw new Exception("Invalid email");
                }
            }
        }

        public override string ToString()
        {
            return string.Format("Name:{0}, Age:{1}, Email:{2}", this.Name, this.Age,
                string.IsNullOrEmpty(this.Email) ? "not set" : this.Email);
        }

    }
}

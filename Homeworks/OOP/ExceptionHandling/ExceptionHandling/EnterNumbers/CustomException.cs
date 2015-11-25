using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace EnterNumbers
{
    class CustomException : Exception
    {
        public CustomException()
            : base() { }

        public CustomException(string message)
            : base(message) { }

        public CustomException(string format, params object[] args)
            : base(string.Format(format, args)) { }

        
    }
}

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace AntlrGO
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Chose 1-3 test");
            string g = Console.ReadLine();
            string p = "text" + g + ".txt";
            string input = File.ReadAllText(p);
            var ms = new MemoryStream(Encoding.UTF8.GetBytes(input));
            var lexer = new GoLexer(new AntlrInputStream(ms));
            var tokens = new CommonTokenStream(lexer);
            var parser = new GoParser(tokens);
            var tree = parser.file();
            var pastwk = new ParseTreeWalker();
            pastwk.Walk(new GoMegaListener(), tree);
            Console.Read();
        }
    }
}

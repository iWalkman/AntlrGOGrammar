using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using System.Reflection;

namespace AntlrGO
{
    class GoMegaListener : GoBaseListener
    {
        string exit = " using System;\n using System.Collections.Generic;\n using System.IO;\n using System.Linq;\n using System.Text;\n using System.Threading.Tasks;\n ";

        string name_of_struct = "";

        string kl = "";

        string struct_name = "";

        public override void EnterFile([NotNull] GoParser.FileContext context)
        {

            string begin_of_file = "namespace Circles\n{\n\tclass Program\n\t{";
            exit += begin_of_file;

        }

        public override void ExitFile([NotNull] GoParser.FileContext context)
        {
            string end_Of_File = "\n\t\t}\n\t}\n\t\n}";
            exit += end_Of_File;
            string path = Directory.GetCurrentDirectory() + "\\output.cs";
            using (StreamWriter file = new StreamWriter(path, false))
            {
                file.WriteLine(exit);
            }
        }

        public override void EnterTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context)
        {
            struct_name = context.children[1].ToString();
            exit += "\n\tpublic struct "+ context.children[1] + "{\n";
        }

        public override void ExitTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context)
        {
            exit += "}\t\n";
        }

        public override void EnterVarDeclaration([NotNull] GoParser.VarDeclarationContext context)
        {
           
            string[] g = new string[] { "int", "float", "complex", "string" };
            string h = "\n\t\t";
            List<string> list = new List<string>();
            foreach (var t in context.children)
            {
                list.Add(t.ToString());
            }

            foreach (var r in g)
            {
                var l = list.FindIndex(x => x == r);

                    for(int i = l; i >= 0; i--)
                    {
                        h += list[i].ToString()+" ";
                    }
                
            }

            exit += "public" + h.Substring(1) + ";\n";
        }

        public override void EnterMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context)
        {
            exit += "\n\t\tstatic void Main(string[] args)\n\t\t{ ";
        }

        public override void ExitMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context)
        {
            exit += "\n\t\t\t ";
        }

        public override void EnterShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context)
        {
            exit += struct_name +" " + context.children[0].ToString() +";\n";
            name_of_struct = context.children[0].ToString();
        }

        public override void ExitShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context)
        {
            name_of_struct = "";
        }

        public override void EnterPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context)
        {
            exit += "\nConsole.WriteLine(";
        }

        public override void ExitPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context)
        {
            exit = exit.Remove(exit.Length - 2);
            exit += "{0} {1} {2}\","+kl+".width, " + kl + ".length, " + kl + ".name ";
            exit += ");\n";
        }

        public override void EnterObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context)
        {
          
        }

        public override void EnterKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context)
        {
            exit += "\n\t"+ name_of_struct +"."+ context.children[0]+ " = "; 
        }

        public override void EnterExpression([NotNull] GoParser.ExpressionContext context)
        {
        }

        public override void EnterPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context)
        {
            switch (context.children[0].ToString())
            {
                case "import": 
                        break;
                case "\"fmt\"":
                    break;
                case "[155 199 209 217 234 248 273 280 65 56 134 54 40]":
                    break;
                case "r1":
                    kl = context.children[0].ToString();
                    break;
                case "r2":
                    kl = context.children[0].ToString();
                    break;
                default:
                    exit += context.children[0].ToString()+";";
                    break;
            }
                
        }
    }
}

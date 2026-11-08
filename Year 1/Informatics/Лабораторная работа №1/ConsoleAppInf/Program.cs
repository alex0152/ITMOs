using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleAppInf
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine($"Пример 10: 523210(Факт) = {FromFactorialTo10("523210")}(10)");
            Console.WriteLine($"Пример 11: 780(10) = {From10ToFibbonachi(780)}(Фиб)");
            Console.WriteLine($"Пример 12: -22190(10) = {FromTenToSimNine(-22190)}(9C)");
            Console.WriteLine($"Пример 13: 1048(-10) = {FromMinus10To10(1048)}(10)");
            Console.ReadKey();
        }

        // функция для перевода числа из СС-Факториальной в СС-10 (задание 10)
        public static string FromFactorialTo10(string num)
        {
            int sum = 0, n = num.Length;
            foreach (char c in num)
            {
                sum += Convert.ToInt32(c.ToString()) * Factorial(n);
                n--;
            }
            return sum.ToString();
        }
        
        // функция перевода числа из СС-10 в СС-Фиб (задание 11)
        public static string From10ToFibbonachi(int num)
        {
            string result = "";
            List<int> positionsFib = new List<int>(); // список номеров чисел Фибоначчи
            while (num > 0)
            {
                // Находим максимальное число Фибоначчи, которое не больше num и вычитаю его 
                num -= GetMaxFibonachi(num, out int pos);
                positionsFib.Add(pos);
            }
            // Собираем число в СС-Фиб
            for (int i = 1; i <= positionsFib.Max(); i++)
            {
                if (positionsFib.Any(pos => pos == i)) result = "1" + result;
                else result = "0" + result;
            }
            return result;
        }

        // функция для перевода числа из СС-10 в СС-9С (задание 12)
        public static string FromTenToSimNine(int num)
        {
            int k = num >= 0 ? 1 : -1; // запоминаем что число меньше или больше нуля
            string simNum = ""; // переменная для возврата числа в СС-9С
            int i = 0;
            // переводим число в СС-9 и идем от младшего разряда
            foreach (char c in From10To9(Math.Abs(num)).Reverse().ToArray()) 
            {
                int chislo = Convert.ToInt32(c.ToString());
                if ((chislo += i) > 9 / 2)
                {
                    simNum = (k * (chislo - 9)) + simNum;
                    i = 1;
                }
                else
                {
                    simNum = (k * chislo) + simNum;
                    i = 0;
                } 
            }
            return simNum;
        }

        // функция перевода числа из СС-(-10) в СС-10 (задание 13)
        public static int FromMinus10To10(int num)
        {
            int result = 0;
            string strNum = num.ToString();
            // идем по каждой цифре и умножаем на (-10)^3
            for (int i = 0, j = strNum.Length - 1; i < strNum.Length; i++, j--)
                result += (int)Math.Pow(-10, j) * Convert.ToInt32(strNum[i].ToString());
            return result;
        }

        // функция нахождения максимального числа Фибоначчи и его номера, которое не больше num (вспомогательная)
        public static int GetMaxFibonachi(int n, out int index)
        {
            int c, pos = 0, a = 0, b = 1;
            while (a + b <= n)
            {
                pos++;
                c = a;
                a = b;
                b += c;
            }
            index = pos;
            return b;
        }

        // факториал (вспомогательная)
        public static int Factorial(int n)
        {
            if (n <= 0) return 1;
            else return n * Factorial(n - 1);
        }

        // функция для перевода числа из СС-10 в СС-9  (вспомогательная)
        public static string From10To9(int num)
        {
            if (num == 0) return "0";
            string numStr = "";
            while (num > 0)
            {
                numStr = (num % 9) + numStr; // Добавляем остаток в начало
                num /= 9;
            }
            return numStr;
        }

    }
}

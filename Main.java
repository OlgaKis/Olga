import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //ввод
        System.out.print("Введите числа, которые хотите посчитать в формате 5 + 3: ");
        Scanner vvod1 = new Scanner(System.in);
        String vvod3 = vvod1.nextLine();
        Olga arab = new Olga(); //вызов метода
        String q = arab.calc(vvod3);
        System.out.println(q);

    }
}
class Olga {

int a; // первая цифра
int b;  // вторая цифра
    char c;//знак
int d;// ариф операция
    public static String calc(String input) {
        String[] vvod2 = input.split(" ");
        String o1 = vvod2[0];
        String o2 = vvod2[2];
        String o3 = vvod2[1];

        Integer a = Integer.valueOf(o1);
        Integer b = Integer.valueOf(o2);
        char с = o3.charAt(0);
        switch (char c){
            case "+": Integer d = a+b;


        String e = d.toString();
        return (e);}
}

    }
}




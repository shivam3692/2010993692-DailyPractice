import java.util.*;



class ComplexNumber {

    // variables to hold real and imaginary part of complex
    // number
    int real, image;


    public ComplexNumber(int r, int i)
    {
        this.real = r;
        this.image = i;
    }


    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }


    public static ComplexNumber add(ComplexNumber n1,
                                    ComplexNumber n2)
    {


        ComplexNumber res = new ComplexNumber(0, 0);


        res.real = n1.real + n2.real;


        res.image = n1.image + n2.image;


        return res;
    }

    public static void main(String arg[])
    {

       Scanner sc =new Scanner(System.in);
       int a =sc.nextInt();
       int b= sc.nextInt();
       int c =sc.nextInt();
       int d= sc.nextInt();


       ComplexNumber c1 = new ComplexNumber(a, b);
       ComplexNumber c2 = new ComplexNumber(c, d);


        System.out.print("first Complex number: ");
        c1.showC();

        System.out.print("\nSecond Complex number: ");
        c2.showC();

        // calling add() to perform addition
        ComplexNumber res = add(c1, c2);

        // displaying addition
        System.out.println("\nAddition is :");
        res.showC();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc =  new Scanner(System.in);
        int resp;

        int v1,v2;

        System.out.println("Escolha o tipo de operação : \n1 = +\n2 = - \n3 = * \n4 = /");
        resp = sc.nextInt();
        

        System.out.println("Digite os 2 valores");
        v1 = sc.nextInt();
        v2 = sc.nextInt();




        if(resp == 1){  

            int valor = v1 + v2;
            System.out.println(valor);

            sc.close();

        }if (resp == 2) {

            int valor = v1 - v2;
            System.out.println(valor);
            sc.close();

        }if (resp == 3) {

            int valor = v1 * v2;
            System.out.println(valor);
            sc.close();
            
        }if (resp == 4) {
            int valor = v1 / v2;
            System.out.println(valor);
            sc.close();
            
        }

    } 
}

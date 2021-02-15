import java.util.Scanner;
class Basics{
    static Scanner input = new Scanner(System.in);
    static void evenOdd(){
        System.out.println("Enter number to be checked:");
        int number = input.nextInt();
        //With if else 
        if(number %2 == 0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
        //with conditional operator
        //String result = (number %2 ==0) ? "even" : "odd" ;
        //System.out.print(result);

    }
    public static void main(String[] args) {
       evenOdd();

    }
}

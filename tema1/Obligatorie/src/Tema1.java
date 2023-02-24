import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        Solution.start();
    }
}
class Solution {
    public static void start(){
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        Integer n = (int) (Math.random() * 1000000);
        n*=3;
        n+=0b10101;//sau Integer.parseInt("...",2);
        n+=0xFF;//sau Integer.parseInt("...",16);
        n*=6 ;
        int result=0;
        while(n!=0){
            result+=n%10;
            n/=10;
        }
        while(result>=10){
            int t =0 ;
            while(result!=0){
                t+=result%10;
                result /=10;
            }
            result =t ;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
 }



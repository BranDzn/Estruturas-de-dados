package fatorial;
public class Fatorial {
    public static void main(String[] args) {
        new Fatoriall();
    }
    
}

class Fatoriall{
    
    Fatoriall(){
        
        System.out.println("fatorial(4):" + fatorial(4));
        System.out.println("fatorial(5):" + fatorial(5));
        
    }
    
    public static long fatorial(int n){
        if(n < 0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return 1;
        }
        else{
            return(n * fatorial(n - 1));
        }
    }
    
}

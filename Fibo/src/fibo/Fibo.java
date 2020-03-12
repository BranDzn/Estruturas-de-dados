package fibo;
public class Fibo {
    public static void main(String[] args) {
        new Processa();
    }
    
}

class Processa{
    Processa(){
        System.out.println("fibo(5):" + fibo(5));
        System.out.println("fibo(7):" + fibo(7));
        System.out.println("fibo(8):" + fibo(8));
        System.out.println("fibo(9):" + fibo(9));       
    }
    
    public static long fibo(int n){
        if(n < 0) return -1;
        else if(n == 0) return 0;
        else if(n == 1) return 1;
        else return (fibo (n -1) + fibo(n - 2));
    }
}

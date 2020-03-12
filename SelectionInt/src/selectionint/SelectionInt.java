package selectionint;
public class SelectionInt {
    public static void main(String[] args) {
        
        int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        
        SelectionNum n = new SelectionNum();
        
        n.selectionSort(numeros);
        
        for(int i : numeros){
            System.out.println(i + "");
        }
        
    }
    
}

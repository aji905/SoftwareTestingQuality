public class Calculator {
    
    public int divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Tidak bisa bagi dengan Nol");
        }else{
            return a/b;
        }
    }
    public int add(int a, int b){
        return a+b;
    }
}

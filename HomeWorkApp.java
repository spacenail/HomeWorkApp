public class HomeWorkApp {
    public static void main(String[] args) {

    }
    static boolean firstMethod(int a, int b){
        if((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    static void secondMethod(int a){
        if(a >= 0){
            System.out.println("Число а=" + a +" положительное");
        } else {
            System.out.println("Число а=" + a +" отрицательное");
        }
    }

    static boolean thirdMethod(int a){
        return a < 0;
    }

    static void fourthMethod(String text, int repeat){
        for(int i = 0; i < repeat; i++){
            System.out.println(text);
        }
    }

    static boolean fifthMethod(int year){
        if(year % 100 == 0) {
            return false;
        } else if((year % 4 == 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {

    public static void main(String[] args) {
	    int[] sayılar=new int []{1,2,5,7,5,9,0};
	    int aranacak=8;
	    boolean varMı= false;
	    for(int sayı:sayılar){
	        if (sayı==aranacak){
	            varMı=true;
	            break;
            }
        }
	    if (varMı){
	        System.out.println("Sayı mevcuttur.");
        }else{
	        System.out.println("sayı mevcut değildir.");
        }

    }
}

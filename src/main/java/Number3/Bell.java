package Number3;

public class Bell {
    private boolean ding_dong = false;


    public void sound(){
        if (ding_dong == false){
            System.out.println("DING");
        }
        else {
            System.out.println("DONG");
        }
        ding_dong = !ding_dong;
    }

}

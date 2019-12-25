import javax.swing.plaf.TreeUI;

public class T {




    public static void main(String[] args) {

        getDesensMobile("15985857788");
        System.out.println();

    }

    public static String getDesensMobile(String mobile){
        mobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(mobile);
        return mobile;
    }




}

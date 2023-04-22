import java.util.Scanner;
class Utility{
    private static Scanner scanner=new Scanner(System.in);
    public static String readKeyboard(int limit){
        String line="";
        while (scanner.hasNext()){
            line=scanner.nextLine();
            if (line.length()<1||line.length()>limit){
                System.out.println("输入长度错误，请重新输入!");
                continue;
            }else{
                break;
            }
        }
        return line;
    }//输入长度判断
    public static char readMenuSelection(){
        char choice;
        while (true){
            String str=readKeyboard(1);
            choice=str.charAt(0);
            if (choice!='1'&&choice!='2'&&choice!='3'&&choice!='4'){
                System.out.println("输入错误，请重新输入！");
            }else{
                break;
            }
        }
        return choice;
    }//鉴定输入的选择正确与否
    public static int readNumber(){
        int num;
        while(true){
            String str=readKeyboard(4);
            try{
                num=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入错误，请重新输入!");
                continue;
            }
        }
        return num;
    }//输入数字判断
    public static String readString(){
        String str=readKeyboard(8);
        return str;
    }//输入字符串判断
    public static char readConfirmSelection(){
        char c;
        while(true){
            String str=readKeyboard(1).toUpperCase();
            c=str.charAt(0);
            if (c=='Y'||c=='N'){
                break;
            }else{
                System.out.println("输入错误，请重新输入!");
            }
        }
        return c;
    }
}//判读是否时的输入是否正确
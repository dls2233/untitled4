import java.util.Scanner;
class main{
    public static void main(String[] args){
        int money=10000,change=0;
        Scanner scanner=new Scanner(System.in);
        String str="",info="";
        Boolean judge=true;
        char x;
        home();
        while(judge) {
            char c = Utility.readMenuSelection();
            switch (c){
                case '1':
                    System.out.println("---------当前收支明细记录---------");
                    System.out.println("收支\t\t账户金额\t\t收支金额\t\t备注");
                    System.out.println(info);
                    System.out.println("-------------------------------");
                    home();
                    break;
                case '2':
                    System.out.println("本次收入金额:");
                    change=Utility.readNumber();
                    money+=change;
                    System.out.println("本次收入说明:");
                    str=Utility.readString();
                    info+="收入\t\t"+money+"\t\t+"+change+"\t\t"+str+"\n";
                    home();
                    break;
                case '3':
                    System.out.println("本次支出入金额:");
                    change=Utility.readNumber();
                    money-=change;
                    System.out.println("本次支出说明:");
                    str=Utility.readString();
                    info+="支出\t\t"+money+"\t\t+"+change+"\t\t"+str+"\n";
                    home();
                    break;
                case '4':
                    System.out.println("是否退出系统(Y/N)");
                    x=Utility.readConfirmSelection();
                    if(x=='Y'){
                        judge=false;
                    }else{
                        home();
                    }
                    break;
            }
        }
        System.out.println("程序结束!");
    }
    public static void home(){
        System.out.println("----------记账系统----------");
        System.out.println("          1.收支细明");
        System.out.println("          2.登记收入");
        System.out.println("          3.登记支出");
        System.out.println("          4.退出系统");
        System.out.println();
        System.out.println("          请选择(1-4)");
    }
}
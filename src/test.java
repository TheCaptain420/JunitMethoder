public class test {

    int kontobelob = 1000;
    int transferbeløb = 0;

    String fckupbeløb = "you done fcked up, ya payed too mucherino";
    String goodurino = "transfer successful";

    public String trasfer(int transferbeløb){
        this.transferbeløb = transferbeløb;
        if(transferbeløb>kontobelob){
            return fckupbeløb;
        }else{
            return goodurino;
        }
    }

/*
    public int summation(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
*/
}
import java.util.Arrays;

public class Que_2 {
    public static void main(String[] args) {
         /*
        Write code to find the sum of the dollars and sum of the euros in the given string
            String str = "$1 $12 €34 €56 $45 €78";
         */

        String str = "$1 $12 €34 €56 $45 €78";

        String arr[]=str.split(" ");
        int sumdolar=0;
        int sumeuro=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("$")){
                String dolar=arr[i].replaceAll("\\D","");
                sumdolar+=Integer.parseInt(dolar);

            }else if(arr[i].contains("€")){
                String euro=arr[i].replaceAll("\\D","");
                sumeuro+=Integer.parseInt(euro);
            }
        }
        System.out.println("Sum dolar= "+sumdolar);
        System.out.println("Sum euro= "+sumeuro);


       summethod("$1 $12 €34 €56 $45 €78");
    }

  ///////2.way: Method//////////////
    public static void summethod(String string){

        String arr[]=string.split(" ");

        int sumdolar=0;
        int sumeuro=0;

        for(String x:arr){
            if(x.contains("$")) {
                sumdolar += Integer.parseInt(x.replaceAll("\\D", ""));
            }else{
                sumeuro+=Integer.parseInt(x.replaceAll("\\D",""));
            }
        }
/*
        if(x.contains("$")){
            sumdolar = sumdolar + Integer.valueOf(x.replace("$", ""));
        } else {
            sumeuro = sumeuro + Integer.valueOf(x.replace("€",""));
        }

 */
        System.out.println("Sum dolar= "+sumdolar);
        System.out.println("Sum euro= "+sumeuro);


    }

}

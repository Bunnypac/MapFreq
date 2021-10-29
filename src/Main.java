import java.util.*;

public class Main {
    static void CountFreq(String str){

        Map<String,Integer> m=new HashMap<String,Integer>();

        String arr[]= str.split(" ");

        for (int i=0;i <arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }

        }
       for(Map.Entry<String,Integer> entry: m.entrySet()){
           System.out.println(entry.getKey()+ " "+ entry.getValue());
       }
        }

    public static void main(String[] args) {

        String str=("My name is Rohan Rohan");
        CountFreq(str);
    }

    }



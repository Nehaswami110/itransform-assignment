package ITransformAssignmentFirst;

import java.util.ArrayList;
import java.util.List;

public class Armstrongnum {

	public static List<Integer> findArmstrong(int n){
		// TODO Auto-generated method stub
		  List<Integer> list=new ArrayList<>();
          int temp=n;
          int sum=0;
            while(temp>0) {
            int b=temp%10;
            sum=sum+b*b*b;
            temp/=10;
            }
            if(sum==n) {
              list.add(sum);
            }
            return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> li=new ArrayList<>();
          for(int i=100;i<=999;i++) {
             li.addAll(findArmstrong(i));
          }
        System.out.println(li);  
    }

	}


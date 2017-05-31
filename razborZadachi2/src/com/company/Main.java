package com.company;

public class Main {

    public static void main(String[] args) {
        float[] M={5.2f,3.1f,2.3f,5.2f,5.2f,4.7f,8.9f,3.1f,5.2f,1.4f};
        //System.out.println(M.length);
        for(int i=0;i<M.length;i++){
            int count=1;
            for(int j=i+1;j<M.length;j++){
                if(M[j]==M[i])
                    count++;
            }
            if(count>1){
                if(i==0)
                    System.out.println("value " + M[i] +" has " + count + "reps");

                if(i!=0){
                    int flag=0;
                    for(int k=0;k<i;k++){
                        if(M[i]==M[k]){
                            flag=1;
                            System.out.println("break because: " + i +" and " + k);
                            k=i-1;
                        }
                        if(k==i-1 && flag==0){
                            System.out.println("value " + M[i] + " has " + count + "reps");
                        }
                    }
                }
            }

        }
    }

}

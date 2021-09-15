public class Substring {
    public int solve(String A) {

        // int [] hash = new int[2];

        // for(int j = 0; j< hash.length; j++){
        //     hash[j]=0;
        // }

        // for(int i = 0; i<A.length(); i++){
        //     if (A.charAt(i)=='0'){
        //         hash[0]++;
        //     }else hash[1]++;
        // }
      ///"Expected input is 0101010 series and it will check the highest substring which have same digits of 0 and 1"//



        int b = 0;
        int mainCount = 0;
        for(int i = 0; i<A.length(); i++){
            if (A.charAt(i)=='0'){
                b++;
            }
            else b--;
            if(b==0){

                mainCount++;

            }

        }
        return mainCount;





    }
}

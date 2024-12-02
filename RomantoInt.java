class RomantoInt {
    public int romanToInt(String s) {
        char[] ch=s.toCharArray();
        int len= ch.length;
        int num=0;
        int res=0;
        int prev=0;
        for(int i=len-1;i>=0;i--){
            char dig=ch[i];
            switch(dig){
                case 'I': 
                  num=1;
                  break;
                case 'V':
                  num=5;
                  break;
                case 'X':
                  num=10;
                  break;
                case 'L':
                  num=50;
                  break;
                case 'C':
                  num=100;
                  break;
                case 'D':
                  num=500;
                  break;
                case 'M':
                  num=1000;
                  break;
            }
            if(num<prev)
               res= res-num; 
            else
               res=res+num;   
            prev=num; 
        }
        return res;
    }
}

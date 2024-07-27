public class Roman {
    
    
        public String intToRoman(int num) {
    
    
    char [] arr=String.valueOf(num).toCharArray();
            String w;
            
           
          
            if(arr.length==4){
                StringBuilder sbr=new StringBuilder();
            
    
    
            sbr.append(posiHajar(arr[0]));
             sbr.append(posiSotok(arr[1]));
             sbr.append(posiDosok(arr[2]));
             sbr.append(posiUnit(arr[3]));
             w=sbr.toString();
             return w;
            
        }
          
            if(arr.length==3){
                StringBuilder sbr=new StringBuilder();
            
    
    
    
             sbr.append(posiSotok(arr[0]));
             sbr.append(posiDosok(arr[1]));
             sbr.append(posiUnit(arr[2]));
             w=sbr.toString();
             return w;
            
        }
          
            if(arr.length==2){
                StringBuilder sbr=new StringBuilder();
            
    
    
            
             sbr.append(posiDosok(arr[0]));
             sbr.append(posiUnit(arr[1]));
             w=sbr.toString();
             return w;
            
        }
         if(arr.length==1){
           
             w=posiUnit(arr[0]);
             return w;
            
        }
        return "k";
        
        
        
    }
    
            
        
         static String posiUnit(int x){
             if(x=='1') return "I";
              if(x=='2') return "II";
             if(x=='3') return "III";
             if(x=='4') return "IV";
             if(x=='5') return "V";
             if(x=='6') return "VI";
             if(x=='7') return "VII";
             if(x=='8') return "VIII";
             if(x=='9') return "IX";
            return "";
             
         }
           static String posiDosok(int x){
             if(x=='1') return "X";
              if(x=='2') return "XX";
             if(x=='3') return "XXX";
             if(x=='4') return "XL";
             if(x=='5') return "L";
             if(x=='6') return "LX";
             if(x=='7') return "LXX";
             if(x=='8') return "LXXX";
             if(x=='9') return "XC";
            
           return "";  
         }
           static String posiSotok(int x){
             if(x=='1') return "C";
              if(x=='2') return "CC";
             if(x=='3') return "CCC";
             if(x=='4') return "CD";
             if(x=='5') return "D";
             if(x=='6') return "DC";
             if(x=='7') return "DCC";
             if(x=='8') return "DCCC";
             if(x=='9') return "CM";
            
            return""; 
         }
           static String posiHajar(int x){
             if(x=='1') return "M";
              if(x=='2') return "MM";
             if(x=='3') return "MMM";
             
             return"";
         }
         
    
}

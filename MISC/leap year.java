class Test{
  public static void main(String args[]){
    int year = 1996;
    boolean leapYear = false;
    if(year%4==0){// check basic condition
      if(year%100==0){//check for century year
        if(year%400==0) leapYear = true;
        else leapYear = false;
      }
      else{// if not century year
        leapYear = true;
      }
    }
    else{
      leapYear = false;
    }
    
    System.out.println(leapYear);
  }
}

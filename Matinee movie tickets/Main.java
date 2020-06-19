  #include<stdio.h>
  int main()
  {
      int age;
      float time,t1=10.15,t2=13.30,t3=18.00,t4=22.00;
      printf("");
      scanf("%d",&age);
      printf("");
      scanf("%f",&time);
      if(age>13 && time==t1 || time==t4)
      {
          printf("$8.00");
      }
      else if(age>13 && time==t2 || time ==t3)
      {
          printf("$5.00");
      }
      else if(age<13 && time==t1 ||time==t4)
      {
          printf("$4.00");
      }
      else if(age<13 && time==t2 || time==t3)
      {
          printf("$2.00");
      }
      return 0;

  } 
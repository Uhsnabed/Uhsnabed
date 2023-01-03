import java.util.*;
public class movieticket
{   

    int ch,screen,p;                                    // data members 
    String z0=" ",z1=" ",z2=" ",date=" ";                  

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("INOX MOVIES WELCOMES YOU TO E-MOVIE TICKET RESERVATION");
        System.out.println();
        System.out.println("Services are currently available in : INOX City Centre 1,Rajarhat and INOX South City,South Kolkata");
        System.out.println();
        System.out.println("Enter code 1 or 2 respectively to select preferred location");
        ch=sc.nextInt();
        while(ch!=1 && ch!=2)
        { System.out.println("Please enter correct code");
            System.out.println("Enter code 1 or 2 respectively to select preferred location");
            ch=sc.nextInt(); 
        }
        if(ch==1)
        {
            System.out.println("Movies               " + "\t"+"\t"+    "Showtime"+"\t"+  "Duration");       // printing movies available along with their showtime and duration
            String t1[]={"Train to Busan 2           ",         "9:30 AM ",      "2:00 hrs"};
            String t2[]={"Starwars: Broken Kingdom   ",         "12:30 PM",      "1:45 hrs"};
            String t3[]={"Avengers Spiderman 4       ",         "3:00 PM ",      "2:15 hrs"};
            String t4[]={"Toy Story:Superheroes Dream",         "7:30 PM ",      "2:00 hrs"};
            System.out.println(t1[0]+"\t"+t1[1] +"\t"+ t1[2]);
            System.out.println(t2[0]+"\t"+t2[1] +"\t"+ t3[2]);    
            System.out.println(t3[0]+"\t"+t3[1] +"\t"+ t3[2]);
            System.out.println(t4[0]+"\t"+t4[1] +"\t"+ t4[2]);
            System.out.println();
            System.out.println("Please entire 1,2,3 or 4 respectively for the desired movie you want to see");
            p=sc.nextInt();
            System.out.println();
            while(p!=1 && p!=2 && p!=3 && p!=4)
            {
                System.out.println("Kindly input ordered instructions. ");
                System.out.println("Please entire 1,2,3 or 4 respectively for the desired movie you want to see");
                p=sc.nextInt();
            } 
            System.out.println();
            if(p==1)                                                           // storing movie name in z0, showtime in z1, duration in z2 and screen no. in screen
            {
                z0=t1[0];z1=t1[1];z2=t1[2];
                screen=1;
            }
            if(p==2)
            {
                z0=t2[0];z1=t2[1];z2=t2[2];
                screen = 2;
            }
            if(p==3)
            {
                z0=t3[0];z1=t3[1];z2=t3[2];
                screen = 3;
            }  
            if(p==4)
            {
                z0=t4[0];z1=t4[1];z2=t4[2];
                screen = 4;
            } 
            System.out.println("Bookings are open for this month only. Entering invalid date may lead to cancellation of ticket! Please type properly.");
            System.out.println("Enter date for which you want to buy tickets in format DD/MM/YYYY");
            date=sc.next();
        }
        else if(ch==2)
        {
            System.out.println("Movies               " + "\t"+"\t"+" Showtime"+"\t"+ "Duration");          // printing movies available along with their showtime and duration
            String t5[]={"Starwars: Broken Kingdom   ","9:30 AM","        2:00 hrs"};
            String t6[]={"Wonderland                 ","12:30 PM","1:45 hrs"};
            String t7[]={"Toy Story:Superheroes Dream","3:00 PM","        2:15 hrs"};
            String t8[]={"Train to Busan 2           ","7:30 PM","        2:00 hrs"};
            System.out.println(t5[0]+"\t"+t5[1] +"\t"+ t5[2]);
            System.out.println(t6[0]+"\t"+t6[1] +"\t"+ t6[2]);    
            System.out.println(t7[0]+"\t"+t7[1] +"\t"+ t7[2]);
            System.out.println(t8[0]+"\t"+t8[1] +"\t"+ t8[2]);
            System.out.println();
            System.out.println("Please enter 1,2,3 or 4 respectively for the desired movie you want to see");
            p=sc.nextInt();
            System.out.println();
            while(p!=1 && p!=2 && p!=3 && p!=4)
            {
                System.out.println("Kindly input ordered instructions. ");
                System.out.println("Please entire 1,2,3 or 4 respectively for the desired movie you want to see");
                p=sc.nextInt();
            } 
            System.out.println();
            if(p==1)
            {
                z0=t5[0];z1=t5[1];z2=t5[2];                                            // storing movie name in z0, showtime in z1, duration in z2 and screen no. in screen
                screen=1;
            }
            if(p==2)
            {
                z0=t6[0];z1=t6[1];z2=t6[2];
                screen = 2;
            }
            if(p==3)
            {
                z0=t7[0];z1=t7[1];z2=t7[2];
                screen = 3;
            }  
            if(p==4)
            {
                z0=t8[0];z1=t8[1];z2=t8[2];
                screen = 4;
            }

            System.out.println("Bookings are open for this month only. Entering invalid date may lead to cancellation of ticket! Please type properly.");
            System.out.println("Enter date for which you want to buy tickets in format DD/MM/YYYY");
            date=sc.next();
        }
    } //end of method input
    void assign()
    {
        System.out.println();                                                            // printing seats
        System.out.println();
        System.out.println("Here's take a look at the seat arrangement");
        System.out.println();
        int l=0;
        String a=" ";
        String e[][]=new String[4][10];
        for(int i=0;i<4;i++)
        {for(int j=0;j<10;j++)
            {l=l+1;
                String st=Integer.toString(l);
                if(i==0)
                {  a="E"+"-"+st+" ";
                }
                else
                {  a="E"+"-"+st;
                }e[i][j]=a;
            }
        }
        int l1=0;
        String a1=" ";
        String f[][]=new String[4][5];
        for(int i=0;i<4;i++)
        {for(int j=0;j<5;j++)
            {l1=l1+1;
                String st1 =Integer.toString(l1);
                if(i<2)
                {
                    a1="F"+"-"+st1+" "; 
                }
                else
                {  a1="F"+"-"+st1;
                }
                f[i][j]=a1;
            }
        }
        int l2=0;
        String v[][]=new String[3][3];
        for(int i=0;i<3;i++)
        {for(int j=0;j<3;j++)
            {l2=l2+1;
                String st2 =Integer.toString(l2);
                String a2="V"+"-"+st2;
                v[i][j]=a2;
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("\t"+"\t"+"      SCREEN");
        System.out.println("\t"+"\t"+"     ^^^^^^^^");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<10;j++)
            {System.out.print(e[i][j]+"  ");
            }

            System.out.println();
        } 
        System.out.println("\t"+"\t"+"   "+"S T A I R S");
        for(int i=0;i<4;i++)
        {for(int j=0;j<5;j++)
            { System.out.print("    "+f[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\t"+"\t"+"   "+"S T A I R S");
        for(int i=0;i<3;i++)
        {for(int j=0;j<3;j++)
            { System.out.print("         "+v[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
    }//end of method assign
    void output()
    { 
        Scanner sc = new Scanner(System.in);

        System.out.println();
        assign();
        System.out.println();
        System.out.println("E-> Economy, F->First Class, V->VIP Box");
        System.out.println("** Prices are higher than normal");
        System.out.println();
        System.out.println("Seat type  "+"\t"+" Fare  ");                        //seat fare
        System.out.println("Economy    "+"\t"+"Rs. 220");
        System.out.println("First Class"+"\t"+"Rs. 300 ");
        System.out.println("VIP Box    "+"\t"+"Rs. 580");
        System.out.println();
        System.out.println("Enter number of seats you want to book");
        int n=sc.nextInt();
        double amt=0;
        int app=0;
        String seat[]=new String[n];
        System.out.println("Please enter your seat number.. eg-> E1,F8,V3...");
           for(int i=0;i<n;i++)
        {
            seat[i]=sc.next();
            char chh=seat[i].charAt(0);
            while(chh!='E' && chh!='V' && chh!='F')
            {
                System.out.println("Invalid seat type");
                System.out.println();
                System.out.println("Please enter your seat number.. eg-> E1,F8,V3..");
                seat[i]=sc.next();
                chh=seat[i].charAt(0);
            }
            String zla = seat[i].substring(1);
            int indi = Integer.parseInt(zla);
            if (chh=='E')
            {
                while(indi<1 || indi>40)
                {
                    System.out.println("Seat does not exist! Please enter valid seats");
                    seat[i]=sc.next();
                    zla = seat[i].substring(1);
                    while(chh!='E' && chh!='V' && chh!='F')
                    {
                        System.out.println("Invalid seat type");
                        System.out.println();
                        System.out.println("Please enter your seat number.. eg-> E1,F8,V3..");
                        seat[i]=sc.next();
                        chh=seat[i].charAt(0);
                    } 

                    indi = Integer.parseInt(zla);

                }
            }
            if (chh=='F')
            {
                while(indi<1 || indi>20)
                {
                    System.out.println("Seat does not exist! Please enter valid seats");
                    seat[i]=sc.next();
                    zla = seat[i].substring(1);

                    while(chh!='E' && chh!='V' && chh!='F')
                    {
                        System.out.println("Invalid seat type");
                        System.out.println();
                        System.out.println("Please enter your seat number.. eg-> E1,F8,V3..");
                        seat[i]=sc.next();
                        chh=seat[i].charAt(0);
                    } indi = Integer.parseInt(zla);
                }
            }
            if (chh=='V')
            {
                while(indi<1 || indi>9)
                {
                    System.out.println("Seat does not exist! Please enter valid seats");
                    seat[i]=sc.next();
                    zla = seat[i].substring(1);

                    while(chh!='E' && chh!='V' && chh!='F')
                    {
                        System.out.println("Invalid seat type");
                        System.out.println();
                        System.out.println("Please enter your seat number.. eg-> E1,F8,V3..");
                        seat[i]=sc.next();
                        chh=seat[i].charAt(0);
                    }  indi = Integer.parseInt(zla);
                }
            }
            if(i>0)
            { 
                System.out.println();
                while(seat[i-1].equals(seat[i]))
                {
                    System.out.println("ERROR! Seat Number already booked. Please enter a different seat number.");
                    System.out.println();
                    seat[i]=sc.next();
                    chh=seat[i].charAt(0);
                    while(chh!='E' && chh!='V' && chh!='F')
                    {
                        System.out.println("Invalid seat type");
                        System.out.println();
                        System.out.println("Please enter your seat number.. eg-> E1,F8,V3..");
                        seat[i]=sc.next();
                        chh=seat[i].charAt(0);
                    }
                }

            }
            char chh1=seat[i].charAt(0);                                  
            if(chh1=='E')
            {app=app+220;                                            // calculation of ticket fare starts
            }
            if(chh1=='F')
            {
                app=app+300;
            }
            if(chh1=='V')
            {
                app=app+580;
            }
        }  //end of for loop
        double etax,ntax,stax,ttax;
        etax= 10.0/100 * app;
        ntax= 15.0/100 * app;
        stax= 20.0/100 * app;
        ttax = etax+ ntax + stax;
        System.out.println("If you want to add food coupon(250/-) with this ticket enter 1 and if not then enter 0");
        int food= sc.nextInt();
        System.out.println();
        while(food!=1 && food!=0)
        {
            System.out.println("Please enter correct code");
            System.out.println("If you want to add food coupon(250/-) with this ticket enter 1 and if not then enter 0");
            food=sc.nextInt();
        }
        int coupon=0;
        System.out.println();
        if(food==1)
        {
            System.out.println("Enter number of food coupon you want to add");
            coupon = sc.nextInt();
        }
        System.out.println();
        int mt=0;
        mt=(250*coupon);
        amt = amt + ttax + app + mt;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"   E-TICKET");            // Printing of bill starts
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+" INOX MOVIES");
        Calendar2.meen1();
        if(ch==1)
        {  System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"Movie Centre: INOX City Centre 1,Rajarhat ");
            System.out.println();
            System.out.println("Movie Name : "+z0 + "  Show Time: "+z1+"   Movie Duration: "+z2+ "   Movie Date: "+date +"   Screen No. : "+screen);
        }
        else
        {
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"Movie Centre: INOX South City,South Kolkata");
            System.out.println();
            System.out.println("Movie Name :"+z0 + "  Show Time: "+z1+"  Movie Duration: "+z2+ "  Movie Date: "+date +"  Screen No. : "+screen);
        }
        System.out.println("Number of seat/s booked : "+n);

        System.out.print("Seat No.  - ");
        for(int i=0;i<n;i++)
        {
            if (i==(n-1))
            { 
                System.out.print(seat[i]);
            }
            else
            {
                System.out.print(seat[i] + ",");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Amount without tax and food:  "+app);
        System.out.println("10% Entertainment tax:        "+etax);
        System.out.println("15% Network tax:              "+ntax);
        System.out.println("20% Service tax:              "+stax);
        System.out.println("Total tax:                    "+ttax);
        System.out.println("Food Charges:                 "+mt);
        System.out.println("Total Payable Amount:         "+amt);
        System.out.println();
        double ram = Math.random();
        String zar = Double.toString(ram);
        String zar2 = zar.substring(3,7);
        System.out.println("Booking No = "+ zar2);
        System.out.println();
        System.out.println("Your seat/s have been booked succesfully! Wish You A Great Movie Experience");
        System.out.println();
        System.out.println("If you want to donate as per your wish to INOX NGOs for poor children please enter 1 else enter 0");
        int cl=sc.nextInt();
        while (cl!=1 && cl!=0)
        {
            System.out.println("Please enter required value");
            System.out.println("If you want to donate as per your wish to INOX NGOs for poor children please enter 1 else enter 0");
            cl=sc.nextInt();
        }
        if(cl==1)
        {
            System.out.println();
            System.out.println("Enter amount you want to donate");
            double donate=sc.nextDouble();
            while(donate<0)
            {System.out.println("Please enter correct value");
                System.out.println("Enter amount you want to donate");
                donate=sc.nextDouble();
            }
        }System.out.println();
        System.out.println("Please rate your booking experience out of 5");
        double pls = sc.nextDouble();
        while(pls>5.0 || pls<0.0)
        {System.out.println("Please enter required value");
            System.out.println("Please rate your booking experience out of 5");
            pls = sc.nextDouble(); 
        }
        System.out.println();
        System.out.println("Thanks for your response and cooperation!");
        System.out.println();
        System.out.println();
        System.out.println("\n"+"\n"+"\n" + "----x-----INOX PRIVATE LIMITED-----x-----");                             //last output printed sentence

    }   //end of method output
    public static void main()     // main method to call above functions
    {
        movieticket ob = new movieticket();        // object creation of class movieticket
        ob.input();
        ob.output();
    }  //end of method main
} //end of class

            
            
            
            
            
                    
        
         
        
            
            
            

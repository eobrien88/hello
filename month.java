public class month {
    // chapter 8 By: Emilie O'brien
import java.util.Scanner;

public class Chapter8{
public class month
{
private int monthNumber;

public Month( int m)
{ if (m<1 || m>12)
return m=1;}

public void setMonthNumber(int m)
{
this.monthNumber = m;
}
public int getMonthNumber()
{
    return monthNumber;
}

public String getMonthName()
{
    if (monthNumber=1)
    {MonthName = "January"; }
    else if (monthNumber=2)
    {MonthName = "Febuary"; }
    else if (monthNumber=3)
    {MonthName = "March"; }
    else if (monthNumber=4)
    {MonthName = "April"; }
    else if (monthNumber=5)
    {MonthName = "May"; }
    else if (monthNumber=6)
    {MonthName = "June"; }
    else if (monthNumber=7)
    {MonthName = "July"; }
    else if (monthNumber=8)
    {MonthName = "August"; }
    else if (monthNumber=9)
    {MonthName = "September"; }
    else if (monthNumber=10)
    {MonthName = "October"; }
    else if (monthNumber=11)
    {MonthName = "November"; }
    else if (monthNumber=12)
    {MonthName = "December"; }
    return MonthName;
}

public String getSeason()
{
    if (monthNumber==12 || monthNumber==1 || monthNumber==2)
{Season = "Winter";}
if (monthNumber==3 || monthNumber==4 || monthNumber==5)
{Season = "Spring";}
if (monthNumber==6 || monthNumber==7 || monthNumber==8)
{Season = "Summer";}
if (monthNumber==9 || monthNumber==10 || monthNumber==11)
{Season = "Fall";}
return Season;
}

public String toString()
{
    return "Month Name: "+ MonthName + "Season: " + Season;
}
public boolean equals( Month month2)
{
 boolean status = false;
    
            if (Month == month2.Month)
                status = true;
            
            return status;
        }
    

   
    public static MonthCreator(){
       int monthnumber1;
       int monthnumber2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Month Number: ");
        monthnumber1 = scanner.nextInt;
    }
}
}
}

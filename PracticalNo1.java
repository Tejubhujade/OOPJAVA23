/* Aim:-Constructor
   Author:-TEJASWINI
   Version:-1.0
   Date:-30/01/2024
*/

class PracticalNo1
{

public static void main(String []arvg)
{
CompanyData SBJIT =new  CompanyData("Tejaswini",19,"Female",22);

SBJIT.dispaly();

}
}
 class CompanyData
{
string name;
int age;
string gender;
int empid;
}
CompanyData()
{
     System.out.println("Inside default.contructor");
}
CompanyData(string nm,int ag,string gen,int em)
{
      System.out.println("Inside para.contructor");
      this.name=nm;
      this.age=ag;
      this.gender=gen;
      this.empid=em;
}

public void display()
{
  System.out.println("Name-"+this.name+"Age -"+this.age+"Gender -"+this.gender+"empid -"+this.empid);

}
}




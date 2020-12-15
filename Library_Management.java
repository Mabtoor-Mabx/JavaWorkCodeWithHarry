// LIBRARY MANAGEMENT SYSTEM DESIGNED BY MABTOOR MABX
package com.company;

class Library
{
    String[] Books;
    int No_Of_Books;


    Library()
    {
        this.Books=new String[100];
        this.No_Of_Books =0;
    }


    public void AddBooks(String Book)
    {
        this.Books[No_Of_Books]=Book;
        No_Of_Books++;
        System.out.println(Book + " Book Has Been Added!!!");
    }


    public void ShowBooks()
    {
        System.out.println("The Avalible Books Are :");
        for (String Book : this.Books)
        {
            if (Book==null)
            {
                continue;
            }
            System.out.println("*" + Book);
        }
    }



    public void IssueBook(String Book)
    {
        for (int i=0;i<this.Books.length;i++)
        {
            if (this.Books[i].equals(Book))
            {
                System.out.println("Book Is Been Issued!!!");
                this.Books[i]= null;
                return;
            }
        }
        System.out.println("Book Does Not Exist!!!");
    }



    public  void ReturnBook(String Book)
    {
        AddBooks(Book);
    }


}


public  class  Library_Management
{

    public static void main(String[] args)
    {
        Library UAF = new Library();
        UAF.AddBooks("Fundamentals Of Algorithm");
        UAF.AddBooks("DISCRETE STRUCTURE");
        UAF.AddBooks("DATA STRUCTURE AND ALGORITHM");
        UAF.ShowBooks();
        UAF.IssueBook("DATA STRUCTURE AND ALGORITHM");
        UAF.ShowBooks();
        UAF.ReturnBook("DATA STRUCTURE AND ALGORITHM");
        UAF.ShowBooks();

    }



}

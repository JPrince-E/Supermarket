/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Prince E
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try{
    Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb", "root", "");
    Statement st = Con.createStatement();
    //String q1="create table sellertbl(sellid varchar(25), sellpass varchar(25))";
    //String q1="create table admintbl(adminid varchar(25), adminpass varchar(25))";
    //String q1="create table categorytbl(catid int, catname varchar(25), catDesc varchar(25))";
    //String q1="create table producttbl(prodid int, prodname varchar(25), prodQty varchar(25), prodprice varchar(25), prodcat varchar(25))";
    //String q1="create table sellertbl(sellid int, sellname varchar(25), sellpass varchar(25), sellgender varchar(20))";
    String q1="create table sales(ID int primary key, ProdName varchar(50), quantity int, price int, total double, date varchar(30), seller varchar(50), sellerid varchar(30))";
    System.out.println(q1);
    st.execute(q1);
    System.out.print("Table Created ");
    Con.close();
    
}catch(Exception e){
    System.out.print(e);
}
    }
    
}

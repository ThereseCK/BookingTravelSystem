package therese_get;

import java.util.ArrayList;

public class Customer {
   public String Name;
   public int Id;
   public String Email;
   public int PhoneNumber;
   public ArrayList<Travels> travels;


   public Customer(String name, int id, String email, int phoneNumber){
       this.Name = name;
       this.Id = id;
       this.Email = email;
       this.PhoneNumber = phoneNumber;
       this.travels = new ArrayList<Travels>();
   }

}

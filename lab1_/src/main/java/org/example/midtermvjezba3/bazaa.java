package org.example.midtermvjezba3;

public class bazaa {}
    /*private static final String KONEKCIJA="NESTO";
    private static final String USERNAME="NESTO";
    private static final String PASSWORD="NESTO";

    private Connection konekcija=null;

    public baza_bogova(){
        try{
            konekcija= DriverManager.getConnection(KONEKCIJA,USERNAME,PASSWORD);
        }
        catch (SQLException e){
            throw new RuntimeException(e);

        }
    }*/

  /*  private static final String STRING="NESTO";
    private static final String USERNAME="NESTO";
    private static final String PASSWORD="NESTO";

    private Connection konekcija=null;

    public baza_bogova() {
        try {
            konekcija = DriverManager.getConnection(STRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    public void getAnimals(String name,int id) throws SQLException{
        PreparedStatement ps=this.konekcija.prepareStatement("SELECT * FROM animal WHERE (name=? AND id>?)");
                ps.setString(1,name);
                ps.setInt(2,id);
        ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int animalId=rs.getInt("id");
                String animalName=rs.getString("name");
                String animalType=rs.getString("type");
                System.out.println(rs.getString("naziv"));
            }

    }
}
      public class povezivanje{
     private static final String KONEKCIJ="";
       private static final String USERNAME="";
         private static final String PASSWORD="";

         private Connection konekcija=null;

         public povezivanje(){
             try{
                konekcija=DriverManager.getConnection(KONEKCIJ,USERNAME,PASSWORD);

             }
             catch (SQLException e){
                 throw new RuntimeException(e);
             }
         }
 public void uzmi() throws SQLException{

 }
     PreparedStatement ps= this.konekcija.prepareStatement("SELECT * FROM animal");
     ResultSet rs=ps.executeQuery();

     while(rs.next()){
          System.out.println("dd");
      }
 }
      }


*/





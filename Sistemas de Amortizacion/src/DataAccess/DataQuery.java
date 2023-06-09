package DataAccess;

import Entities.CreditAdvisor;
import Entities.CreditAdvisorData;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.FinancialEntityData;
import Entities.InterestRate;
import Entities.UserCredentialsAndRole;
import Entities.UserRoles;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DataQuery {
    
    ResultSet datos, dato;
    Statement st;
    Connection cn;
    
    public DataQuery() {
        DbConnection con = new DbConnection();
        cn = con.connection();
    }
// Muestra todos los asesores o usuarios con toda su informacion
    public ArrayList<CreditAdvisor> queryAdvisor() {
        ArrayList<CreditAdvisor> advisors = new ArrayList();
        String query = "SELECT * FROM CreditAdvisor";
        CreditAdvisor advisor;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                advisor = new CreditAdvisor();
                advisor.setID_Cred_Adv(datos.getInt("ID_Cred_Adv"));
                advisor.setName_Adv(datos.getString("Name_Adv"));
                advisor.setLast_Name_Adv(datos.getString("Last_Name_Adv"));
                advisor.setPass(datos.getString("Pass"));
                advisor.setUser(datos.getString("User"));
                advisor.setFin_Ent_ID(datos.getInt("Fin_Ent_ID"));
                advisor.setID_User_Rol(datos.getInt("ID_User_Rol"));
                
                advisors.add(advisor);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return advisors;
    }
// Muestra todos los tipos de creditos que existen con toda su informacion 
    public ArrayList<CreditType> queryCreditType() {
        ArrayList<CreditType> credits = new ArrayList();
        String query = "SELECT * FROM CreditType";
        CreditType credit;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                credit = new CreditType();
                credit.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
                credit.setName_Cred(datos.getString("Name_Cred"));
                credits.add(credit);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return credits;
    }
// Muestra todos los tipos de entidades bancarias con toda su informacion  
    public ArrayList<EntityType> queryEntityType() {
        ArrayList<EntityType> entitys = new ArrayList();
        String query = "SELECT * FROM EntityType";
        EntityType entity;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                entity = new EntityType();
                entity.setID_Ent_Typ(datos.getInt("ID_Ent_Typ"));
                entity.setNam_Ent_Typ(datos.getString("Nam_Ent_Typ"));
                entitys.add(entity);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return entitys;
    }
// Muesta las entidades financieras con toda su informacion    
    public ArrayList<FinancialEntity> queryFinancialEntity() {
        ArrayList<FinancialEntity> financials = new ArrayList();
        String query = "SELECT * FROM FinancialEntity";
        FinancialEntity financial;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                financial = new FinancialEntity();
                financial.setID_Fin_Ent(datos.getInt("ID_Fin_Ent"));
                financial.setNam_Fin_Ent(datos.getString("Nam_Fin_Ent"));
                financial.setEnt_Typ_ID(datos.getInt("Ent_Typ_ID"));
                
                financials.add(financial);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return financials;
    }
// Muestra las tasas de interes con toda su informacion  
    public ArrayList<InterestRate> queryInterestRate() {
        ArrayList<InterestRate> interests = new ArrayList();
        String query = "SELECT * FROM InterestRate";
        InterestRate interest;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                interest = new InterestRate();
                interest.setID_Int_Rat(datos.getInt("ID_Int_Rat"));
                interest.setRat_Year(datos.getDouble("Rat_Year"));
                interest.setCre_Typ_ID(datos.getInt("Cre_Typ_ID"));
                interest.setFin_Ent_ID(datos.getInt("Fin_Ent_ID"));
                interest.setMax_Time(datos.getInt("Max_Time"));
                interests.add(interest);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return interests;
    }
// Muestra los relos de usuarios con toda su informacion 
    public ArrayList<UserRoles> queryUserRoles() {
        ArrayList<UserRoles> roles = new ArrayList();
        String query = "SELECT * FROM UserRoles";
        UserRoles rol;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                rol = new UserRoles();
                rol.setID_User_Rol(datos.getInt("ID_User_Rol"));
                rol.setName_Rol(datos.getString("Name_Rol"));
                roles.add(rol);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return roles;
    }
// Recupera la informacion del asesor de credito si el usuario y la contraseña coinciden 
    public UserCredentialsAndRole findUserByCredentials(String user, String pass) {
        String query = "SELECT ID_Cred_Adv, Name_Adv , Last_Name_Adv, Name_Rol FROM CreditAdvisor JOIN UserRoles ON CreditAdvisor.ID_User_Rol = UserRoles.ID_User_Rol WHERE User = '" + user + "' AND Pass = '" + pass + "';";
        UserCredentialsAndRole credential = null;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                credential = new UserCredentialsAndRole();
                credential.setID_Cred_Adv(datos.getInt("ID_Cred_Adv"));
                credential.setName(datos.getString("Name_Adv"));
                credential.setLastName(datos.getString("Last_Name_Adv"));
                credential.setRoleName(datos.getString("Name_Rol"));
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return credential;
    }
// Filtra las entidades financieras por tipo de credito y tipo de entidad   
    public ArrayList<FinancialEntityData> getFinancialDataByEntity(String creditType, String entityType ) {
        ArrayList<FinancialEntityData> roles = new ArrayList();
        String query = "SELECT FinancialEntity.ID_Fin_Ent, FinancialEntity.Nam_Fin_Ent, "
                + "EntityType.ID_Ent_Typ, EntityType.Nam_Ent_Typ, CreditType.ID_Type_Cred, "
                + "CreditType.Name_Cred, InterestRate.ID_Int_Rat, InterestRate.Rat_Year,Max_Time"
                + "FROM FinancialEntity"
                + "JOIN EntityType ON FinancialEntity.Ent_Typ_ID = EntityType.ID_Ent_Typ"
                + "JOIN InterestRate ON FinancialEntity.ID_Fin_Ent = InterestRate.Fin_Ent_ID"
                + "JOIN CreditType ON InterestRate.Cre_Typ_ID = CreditType.ID_Type_Cred;"
                + "WHERE CreditType.Name_Cred = '"+creditType+"' AND EntityType.Nam_Ent_Typ = '"+entityType+"';";
        FinancialEntityData rol;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                rol = new FinancialEntityData();
                rol.setID_Fin_Ent(datos.getInt("ID_Fin_Ent"));
                rol.setNam_Fin_Ent(datos.getString("Nam_Fin_Ent"));
                rol.setID_Ent_Typ(datos.getInt("ID_Ent_Typ"));
                rol.setNam_Ent_Typ(datos.getString("Nam_Ent_Typ"));
                rol.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
                rol.setName_Cred(datos.getString("Name_Cred"));
                rol.setID_Int_Rat(datos.getInt("ID_Int_Rat"));
                rol.setRat_Year(datos.getDouble("Rat_Year"));
                rol.setMax_Time(datos.getInt("Max_Time"));
                roles.add(rol);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return roles;
    }
// Filatra la entidad financiera a la que perteneces un asesor   
    public ArrayList<CreditAdvisorData> findByCreditAdvisor(int id) {
        ArrayList<CreditAdvisorData> roles = new ArrayList();
        String query = "SELECT FinancialEntity.ID_Fin_Ent, FinancialEntity.Nam_Fin_Ent, "
                + "EntityType.ID_Ent_Typ, EntityType.Nam_Ent_Typ, CreditType.ID_Type_Cred, "
                + "CreditType.Name_Cred, InterestRate.ID_Int_Rat, InterestRate.Rat_Year,Max_Time, "
                + "CreditAdvisor.ID_Cred_Adv, CreditAdvisor.Name_Adv, CreditAdvisor.Last_Name_Adv "
                + "FROM CreditAdvisor JOIN FinancialEntity ON CreditAdvisor.Fin_Ent_ID = "
                + "FinancialEntity.ID_Fin_Ent JOIN UserRoles ON CreditAdvisor.ID_User_Rol = "
                + "UserRoles.ID_User_Rol JOIN InterestRate ON FinancialEntity.ID_Fin_Ent = "
                + "InterestRate.Fin_Ent_ID JOIN CreditType ON InterestRate.Cre_Typ_ID = "
                + "CreditType.ID_Type_Cred JOIN EntityType ON FinancialEntity.Ent_Typ_ID = "
                + "EntityType.ID_Ent_Typ WHERE CreditAdvisor.ID_Cred_Adv = " + id + ";";
        CreditAdvisorData rol;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                rol = new CreditAdvisorData();
                rol.setID_Fin_Ent(datos.getInt("ID_Fin_Ent"));
                rol.setNam_Fin_Ent(datos.getString("Nam_Fin_Ent"));
                rol.setID_Ent_Typ(datos.getInt("ID_Ent_Typ"));
                rol.setNam_Ent_Typ(datos.getString("Nam_Ent_Typ"));
                rol.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
                rol.setName_Cred(datos.getString("Name_Cred"));
                rol.setID_Int_Rat(datos.getInt("ID_Int_Rat"));
                rol.setRat_Year(datos.getDouble("Rat_Year"));
                rol.setMax_Time(datos.getInt("Max_Time"));
                rol.setID_Cred_Adv(datos.getInt("ID_Cred_Adv"));
                rol.setName_Adv(datos.getString("Name_Adv"));
                rol.setLast_Name_Adv(datos.getNString("Last_Name_Adv"));
                roles.add(rol);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return roles;
    }
    
    
    // Muestra todos los tipos de creditos que existen con toda su informacion 
//    public ArrayList<CreditType> queryFinByIDCreditType(int ID_Type_Cred) {
//        ArrayList<CreditType> credits = new ArrayList();
//        String query = "SELECT * FROM CreditType WHERE ID_Type_Cred="+ID_Type_Cred+";";
//        CreditType credit;
//        try {
//            st = cn.createStatement();
//            datos = st.executeQuery(query);
//            while (datos.next()) {
//                credit = new CreditType();
//                credit.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
//                credit.setName_Cred(datos.getString("Name_Cred"));
//                credits.add(credit);
//            }
//        } catch (SQLException ex) {
//            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//        return credits;
//    }
    
}

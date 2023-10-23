package projects;

import projects.dao.DbConnection;

public class ProjectsApp {
  public static void main(String[] args) {
    System.out.println("Attempting to connect to the database...");
    System.out.println("=====================DB_CONNECTION=====================");
     DbConnection.getConnection();
    System.out.println("=====================DB_CONNECTION=====================");

  }

}

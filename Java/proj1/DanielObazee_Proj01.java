
package danielobazee_proj01;


public class DanielObazee_Proj01 {

   
  public static void main(String[] args) {
      
      double currentPopulation = 312_032_486; 
      int secondPerYear = 365 * 24 * 3600;
      
      double birthPerYear = secondPerYear/7.0;
      double deathPerYear = secondPerYear/13.0;
      double immigrantPerYear = secondPerYear/45.0;
      
      double computedPopulation = (birthPerYear + deathPerYear) - immigrantPerYear;
       
      double oneYearPopulation = currentPopulation + computedPopulation;
      double twoYearsPopulation = currentPopulation + (2 * computedPopulation);
      double threeYearsPopulation = currentPopulation + (3 * computedPopulation);
      double fourYearsPopulation = currentPopulation + (4 * computedPopulation);
      double fiveYearsPopulation = currentPopulation + (5 * computedPopulation);

      
      System.out.printf(
      "Population after 1 year = %.0f%n"+
      "Population after 2 years = %.0f%n"+
      "Population after 3 years = %.0f%n"+
      "Population after 4 years = %.0f%n"+       
      "Population after 5 years = %.0f%n",
      oneYearPopulation, twoYearsPopulation, threeYearsPopulation, fourYearsPopulation, fiveYearsPopulation  
      ); 
       
        
    }
    
}

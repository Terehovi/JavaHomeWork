package homework2;
public class task2 {
    public static void main(String[] args) {
        String name = "Ivanov";
        String country = "Russia";
        String city = "Moscow";
        String age = null;

        StringBuilder whereClause = new StringBuilder();

        if (name != null) {
            whereClause.append("name='").append(name).append("'");
        }

        if (country != null) {
            if (whereClause.length() != 0) {
                whereClause.append(" AND ");
            }
            whereClause.append("country='").append(country).append("'");
        }

        if (city != null) {
            if (whereClause.length() != 0) {
                whereClause.append(" AND ");
            }
            whereClause.append("city='").append(city).append("'");
        }

        String sqlQuery = "select * from students where " + whereClause.toString();
        System.out.println(sqlQuery);
        
    }
    
}
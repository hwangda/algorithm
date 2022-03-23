import java.util.Arrays;

public class CorporationSalary {

    private static long[] salaries;

    public static long totalSalary(String[] relations){
        salaries = new long[relations.length];
        
        long total = 0;
        for(int i=0;i<relations.length;i++){
            total += getSalary(i, relations);
        }
        return total;
    }

    public static long getSalary(int i, String[] relations){
        System.out.println("in ");
        if(salaries[i] == 0){ 
            long salary = 0;
            String relation = relations[i];

            for(int j=0;j<relation.length();j++){

                System.out.println("i : " + i + ", j : " + j);

                if(relation.charAt(j) == 'Y'){
                    salary += getSalary(j, relations);
                }
            }

            if(salary == 0) salary = 1;

            salaries[i] = salary;

            System.out.println(Arrays.toString(salaries));
        }

        return salaries[i];
    }
    
    public static void main(String[] args) {
        String[] relations = {"NNYN", "NNYN", "NNNN", "NYYN"};
        System.out.println(totalSalary(relations));

        String[] relations2 = {"NNNN", "NNNN", "NNNN", "NNNN"};
        System.out.println(totalSalary(relations2));

        String[] relations3 = {"NNNNNN", "YNYNNY", "YNNNNY", "NNNNNN", "YNYNNN", "YNNYNN"};
        System.out.println(totalSalary(relations3));

    }
}
public class Salary{
    public static void main(String[] args) {
        int salary = 20000;
        // if(salary > 10000){
        //     salary = salary + 2000;
        // }
        // else{
        //     salary = salary + 1000;
        // }
        //   System.out.println(salary);

        //multiple if-else
        if(salary > 10000){
            salary += 2000;
        }
        else if (salary > 5000){
            salary += 1000;
        }
        else{
            salary += 500;
        }

        System.out.println(salary);
    }
}
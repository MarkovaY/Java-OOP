package Lab.WorkingWithAbstraction.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void parseCommand(String[] input) {

        String argument = input[0];
        String name = input[1];
        switch (argument) {
            case "Create":

                int age = Integer.parseInt(input[2]);
                double grade = Double.parseDouble(input[3]);

                if (!repo.containsKey(name)) {
                    Student student = new Student(name, age, grade);
                    repo.put(name, student);
                }
                break;
            case "Show":

                if (repo.containsKey(name)) {

                    StringBuilder stringBuilder = new StringBuilder();
                    Student student = repo.get(name);
                    stringBuilder.append(String.format("%s is %s years old.", student.getName(), student.getAge()));

                    if (student.getGrade() >= 5.00) {
                        stringBuilder.append(" Excellent student.");
                    } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                        stringBuilder.append(" Average student.");
                    } else {
                        stringBuilder.append(" Very nice person.");
                    }

                    System.out.println(stringBuilder);
                }
                break;
        }
    }
}
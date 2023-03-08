package project;

public class Student {

    static{
        System.out.println("CLASS STUDENT");
        System.out.println("\n");
    }
    private String firstName;
    private String lastName;
    private int age;

    /**
     * this method sets the first name of the student to the instance one
     * @param firstName
     */
    public void setFirstName(String firstName) throws RuntimeException{
        if(firstName != null && !firstName.isEmpty()){
                if(firstName.charAt(0) == Character.UPPERCASE_LETTER){
                    this.firstName = firstName;
                }else{
                    throw new RuntimeException("invalid assigment!");
                }
        }else{
            throw new RuntimeException("invalid assigment!");
        }
    }

    /**
     * with this method we can get the students first name
     * @return firstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * this method sets the last name of the student to the instance one
     * @param lastName
     */
    public void setLastName(String lastName) throws RuntimeException{
        if(lastName != null && !lastName.isEmpty()){
            if(lastName.charAt(0) == Character.UPPERCASE_LETTER){
                this.lastName = lastName;
            }else{
                throw new RuntimeException("invalid assigment!");
            }
        }else{
            throw new RuntimeException("invalid assigment!");
        }
    }

    /**
     * with this method we can get the students last name
     * @return lastName
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * this method sets the age of the student to the instance one
     * @param age
     */
    public void setAge(int age)throws RuntimeException {
        if(age > 15 && age < 81){
            this.age = age;
        }else{
            throw new RuntimeException("invalid assigment! age must be more than 15 and less than 81");
        }
    }

    /**
     * with this method we can get the students age
     * @return age
     */
    public int getAge() {
        return age;
    }



    public Student(String firstName, String lastName, int age) throws RuntimeException{

        //checks if firstName wos entered correctly
        if(firstName != null && !firstName.isEmpty()){
            if(firstName.charAt(0) == Character.UPPERCASE_LETTER){
                this.firstName = firstName;
            }else{
                throw new RuntimeException("invalid assigment!");
            }
        }else{
            throw new RuntimeException("invalid assigment!");
        }

        //checks if  lastName was entered correctly
        if(lastName != null && !lastName.isEmpty()){
            if(lastName.charAt(0) == Character.UPPERCASE_LETTER){
                this.lastName = lastName;
            }else{
                throw new RuntimeException("invalid assigment!");
            }
        }else{
            throw new RuntimeException("invalid assigment!");
        }

        //checks if age wos entered correctly
        if(age > 15 && age < 81){
            this.age = age;
        }else{
            throw new RuntimeException("invalid assigment! age must be more than 15 and less than 81");
        }
    }
    public Student(){}
}

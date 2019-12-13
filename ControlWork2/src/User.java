import org.jetbrains.annotations.NotNull;

class User {
    private enum Gender {Male, Female, Another};
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;
    private double money;
    private String country;
    private String job;

    public User(@NotNull String id, String first_name, String last_name, String email, @NotNull String gender, @NotNull String money, String country, String job){
        this.id = Integer.parseInt(id);
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = Double.parseDouble(money.substring(1));
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }

    public User(int id, String first_name, String last_name, String email, @NotNull String gender, double money, String country, String job){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = money;
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }


    public double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public Object getGender() {
        return gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getJob() {
        return job;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setGender(@NotNull String gender) {
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;
        }
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMoney(String money) {
        this.money = Double.parseDouble(money.substring(1));
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString(){
        return ""+id+" "+first_name+" "+last_name+" "+email+" "+gender+" "+money+" "+country+" "+job;
    }
}
package Classes;

public class ContaCliente {
		private String name;
		private int age;
		private String sex;
		private int id;
		private String city;
		public ContaCliente(String name, int age, String sex, int id, String city) {
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.id = id;
			this.city = city;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public void toView(){
			System.out.println("Name: "+ getName());
			System.out.println("Age " + getAge());
			System.out.println("Sex: " + getSex());
			System.out.println("ID: " + getId());
			System.out.println("City: " + getCity() + "\n\n");
		}
}
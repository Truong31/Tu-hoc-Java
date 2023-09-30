package OOP.Bai40_CacDangKeThua.Dang1_Single;

    public class Animal {
        protected String name;
    
        public Animal(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
        public void eat()
        {
            System.out.println("Eating");
        }
    }

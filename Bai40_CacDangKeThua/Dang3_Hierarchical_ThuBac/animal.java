package OOP.Bai40_CacDangKeThua.Dang3_Hierarchical_ThuBac;
public class animal {
        protected String name;
        protected String Home;
        public animal(String name, String Home) {
            this.name = name;
            this.Home = Home;
        }
        public animal() {
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
        public String getHome() {
            return Home;
        }
        public void setHome(String home) {
            Home = home;
        }
    }

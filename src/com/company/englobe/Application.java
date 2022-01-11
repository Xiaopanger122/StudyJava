package com.company.englobe;

public class Application {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Al", 40, 111, "HHS", 11);
        Worker worker2 = new Worker("Elaine", 35, 112, "HHS", 10);
        Worker worker3 = new Worker("John", 33, 113, "HHS", 9);

        System.out.println(worker1.eat("apple"));
        System.out.println(worker1.drill("Kyle's Home"));
        worker1.fart();

        Manager manager = new Manager("Kyle", 35, 2, "HHS", 22);

        manager.fart();
        System.out.println(manager.hire(worker1));
        System.out.println(manager.hire(worker2));
        System.out.println(manager.hire(worker3));

        System.out.println(manager.staff);
        System.out.println(manager.fire(worker1));
        System.out.println(manager.fire(worker1));

        System.out.println(manager.staff);
        //System.out.println(manager.magic);
    }

}

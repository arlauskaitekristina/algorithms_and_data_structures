package seminar_04;

public class task_01_Main {
    public static void main(String[] args) {
        task_01_HashMap hm = new task_01_HashMap();
        for(int i=0; i<10; i++){
            hm.add(i, i*i);
        }
        hm.add(150, 45);
//        hm.del(5);
//        hm.del(13);
        hm.print();

//        System.out.println(hm.find(150));
//        System.out.println(hm.find(143));
    }
}


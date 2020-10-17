public class second extends third {
    private int num;

    private spisok spisok;

    private four four;

    public four getFour() {
        return four;
    }

    public int getNum() {
        return num;
    }

    public second (int num, four four){
        super(num, four);
        this.four = four;
        this.num = num;
    }

    public void second (int num, four four){
        for (int i = 0; i < num; i++) {
            System.out.println(four);
        }
    }

    final public void second (four four, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(four);
        }
    }

    public void second(int num, four four, spisok spisok){
        for (int i = 0; i < num; i++) {
            System.out.println(four);
        }
    }

    public String getInfo (){
        return super.getInfo();
    }
}

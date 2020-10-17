public class third {
    private int num;

    private spisok spisok;

    ;
    private four four;

    public four getFour() {
        return four;
    }

    public int getNum() {
        return num;
    }

    public third (int num, four four){
        this.four = four;
        this.num = num;
    }

    public String getInfo (){
return "result: " + num + " " + four;
    }
}

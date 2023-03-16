package java13SelfStudy;

public class Hero {
    
    private String name;
    public String getName() {
        return name;
    }
    
    private int hp; //default 값이 다 지정되어있음
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp; 
    }
    
    Sword sword;
    static int MONEY;
    
    // 기본생성자
    Hero() {
        this.hp = 100;
        this.name = "김영웅";
    }
    // 생성자 오버로드
    Hero(String name, int hp) {
        this.hp = 100;
        this.name = name;   // 인수 값으로 name 필드 초기화
        System.out.println("Hero생성자");
    }
    
    void attack() {
        System.out.println(this.name + "는 공격했다!");
        System.out.println("적에게 5포인트의 데미지를 주었다!");
    }
    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + " 입니다");
    }
    void sit(int sec) {
        this.hp += sec; // 앉은 초 수만큼  hp가 증가
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다!");
        System.out.println("5의 데미지!");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
    
}

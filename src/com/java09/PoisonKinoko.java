package com.java09;

public class PoisonKinoko extends Kinoko {
    private int poisonCount;
    
    // getPoisonCount getter&setter는 내부의 작업이니까 안써도 됨 
    
    public PoisonKinoko(char suffix) {
        super(suffix);
        poisonCount = 5;
        // TODO Auto-generated constructor stub
    }
    @Override //주석임. 빌드할때 영향이 없음, 지워도 영향이 없음 그러면 왜 함? 
    public void attack(Hero hero) {
        // TODO Auto-generated method stub
        super.attack(hero);
        if (poisonCount > 0) {
            poisonCount--;
            System.out.println("추가로, 독 포자를 살포했다!");
            int beforeAttackHp = hero.getHp();
            hero.setHp(beforeAttackHp * 4 / 5);
            System.out.println(beforeAttackHp - hero.getHp()  + "포인트의 데미지");
        }
    }
    
}

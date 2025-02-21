package edu.kh.oop.practice.model.vo;


public class Hero {
	
	private String nickname ;
	private String job ;
	private int hp ;
	private int mp ;
	private int level ;
	private double exp ;
	
	public Hero() {} //기본 생산자 
	
	//매개변수 생성자 
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.printf(
			 	          "========캐릭터 생성========\n"
						+ "%s 직업으로 '%s'님이 생성되었습니다\n" 
						+ "현재레벨 : %d\n"
						+ "현재 hp : %d\n"
						+ "현재 mp : %d\n"
						+ "현재 경험치 : %d\n",job ,nickname,level,hp,mp,exp );
	}
	
	public void attack(double exp) {
		this.exp += exp ;
		
		System.out.printf("'%s' 은/는 공격을 했다!! 현재 경험치 : %,1f ",nickname,this.exp);
		
		if(this.exp >= 300) {
			this.level ++ ;
			System.out.printf("레벨이 올랐습니다! 현재레벨 : %d",level);
		}
		
	}
	
	public void dash() {
		this.mp -= 10 ;
		System.out.printf("'%s'은/는 엄청 빠른 대시! 남음 마력 : %d",nickname,this.mp);
		if (this.mp<=0) {
			System.out.println("마력부족 더 이상 대시 할 수 없어요");
		}
		
	}
	
	

	

	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	
	
}

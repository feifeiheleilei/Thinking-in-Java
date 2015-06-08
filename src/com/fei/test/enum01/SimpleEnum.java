package com.fei.test.enum01;

/**
 * @author rookiew
 * 创建一个枚举类型Sp,有三个值
 * 有默认的toString()方法，oridinal()方法，表示值
 * enum本身就是一个类 
 */

enum Sp{
	NOT,MILD,HOT
}
public class SimpleEnum {
	/**
	 * enum和switch搭配很棒
	 */
	Sp sp;
	public SimpleEnum(Sp sp){
		this.sp=sp;
	}
	public void describe(){
		switch (sp) {
		case NOT:
			System.out.println("is not");
			break;
		case MILD:
			System.out.println("is MILD");
			break;
		case HOT:
			System.out.println("is hot");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Sp mildSp = Sp.MILD;
		System.out.println(mildSp);
		System.out.println(mildSp.ordinal());
		
		SimpleEnum simpleEnum= new SimpleEnum(Sp.HOT);
		simpleEnum.describe();
	}

}

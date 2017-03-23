package com.why.javacore.wanghongyuan;
public class TestAC {

	public static void main(String[] args) {
		Administrator  admin1=new Administrator();
		admin1.name="zhangsan";
		admin1.password=123456;
		Administrator  admin2=new Administrator();
		admin2.name="lisi";
		admin2.password=654321;
		
		admin1.show();
		admin2.show();
		
		Customer  customer=new Customer();
		customer.num=1000;
		customer.cardType="VIP" ;
		customer.show();
	}

}

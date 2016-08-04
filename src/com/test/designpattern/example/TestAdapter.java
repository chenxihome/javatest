package com.test.designpattern.example;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hotel hotel=new Hotel();
      GBSocketInterface gbsock=new GBSocket();
      SocketAdapter adapter=new SocketAdapter(gbsock);
      
      hotel.setSocket(adapter);
      hotel.charge();
	}

}

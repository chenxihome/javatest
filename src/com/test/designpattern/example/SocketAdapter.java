package com.test.designpattern.example;

public class SocketAdapter implements DBSocketInterface {

	//组合新接口  
    private GBSocketInterface gbSocket;  
      
    /** 
     * 在创建适配器对象时，必须传入一个新街口的实现类 
     * @param gbSocket 
     */  
    public SocketAdapter(GBSocketInterface gbSocket) {  
        this.gbSocket = gbSocket;  
    }  
	@Override
	public void powerWithTwoRound() {
		// TODO Auto-generated method stub
		gbSocket.powerWithThreeRound();
	}

}

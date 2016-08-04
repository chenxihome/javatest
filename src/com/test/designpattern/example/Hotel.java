package com.test.designpattern.example;

public class Hotel {
	 private DBSocketInterface dbSocket;  
     
	    public Hotel(){}  
	      
	    public Hotel(DBSocketInterface dbSocket) {  
	        this.dbSocket = dbSocket;  
	    }  
	  
	    public void setSocket (DBSocketInterface dbSocket){  
	        this.dbSocket = dbSocket;  
	    }  
	  
	    //旅馆中有一个充电的功能  
	    public void charge(){  
	          
	        //使用德标插口充电  
	        dbSocket.powerWithTwoRound();  
	    }  
}

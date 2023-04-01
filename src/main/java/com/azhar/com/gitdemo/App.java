package com.azhar.com.gitdemo;


public class App 
{
	public void addData(String data) {
		System.out.println("data"+data);
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}
	public void addOneMethod(){
		System.out.println("New method is added");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

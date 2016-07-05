package com.design.behaviorpattern.Strategy;

public class Context {
	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int number, int number1){
		   
	      return strategy.doOperation(number, number1);
	      
	   }
}

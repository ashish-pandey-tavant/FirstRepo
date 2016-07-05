package com.design.behaviorpattern.Strategy;

public class Context {
	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int number2){
	      return strategy.doOperation(num1, number2);
	   }
}

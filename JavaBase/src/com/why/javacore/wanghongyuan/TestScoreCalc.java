package com.why.javacore.wanghongyuan;

public class TestScoreCalc {

	public static void main(String[] args) {
		ScoreCalc scorecalc =new ScoreCalc();
		scorecalc.Java=80;
		scorecalc.C=95;
		scorecalc.DB=65;
		
		scorecalc.sum=240;
		scorecalc.avg=(int)80.0;
		scorecalc.show();
	}

}

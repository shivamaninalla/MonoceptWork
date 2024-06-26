package com.monocept.isp.solution;

import com.monocept.isp.violation.IWorker;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorkerSolution labour=new LabourSolution();
		labour.start();
		labour.stop();
		labour.eat();
		labour.rest();
		
		IWorkable robot=new RobotSolution();
		robot.start();
		robot.stop();
		

	}

}

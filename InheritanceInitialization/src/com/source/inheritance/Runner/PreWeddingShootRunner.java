package com.source.inheritance.Runner;

import com.source.inheritance.PreWeddingShoot;
import com.source.inheritance.Super.MiniatureShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PreWeddingShoot pre = new MiniatureShoot("Nikon","Dual Core",45000);
		MiniatureShoot mini = (MiniatureShoot)pre;
		mini.letsSee();
		
		
		
		
		
		
		
	}

}

package chap6.sec12.exam03_import.mycompany;

import chap6.sec12.exam03_import.hankook.*;
import chap6.sec12.exam03_import.hyndai.Engine;
import chap6.sec12.exam03_import.kumho.*;

//import문
public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	chap6.sec12.exam03_import.hankook.Tire tire3 = new chap6.sec12.exam03_import.hankook.Tire();
	chap6.sec12.exam03_import.kumho.Tire tire4 = new chap6.sec12.exam03_import.kumho.Tire();
}

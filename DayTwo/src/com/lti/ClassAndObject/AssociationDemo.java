package com.lti.ClassAndObject;

public class AssociationDemo
{
	public static void main(String[] args) 
	{
		public static void main(String[] args)
		{
			
			ford f = new ford();
			f.carinfo();
			f.property();
				}

			}
			class Car{
				String color="Orange";
				int maxspeed=220;
				void carinfo() {
					System.out.println("color  " +color+   "Maxspeed  "   +maxspeed);
					
				}
			}
			class ford extends Car{//is a
				void property() {
					Engine e = new Engine();
					e.start();
					Sunroof s = new Sunroof();
					s.openroof();
						}
			}
			class Engine {// has a 
				void start() {
					System.out.println("ignition on");
				}
				void stop() {
					System.out.println("ignition off");
				}
				}
			class Sunroof{
				void openroof() {
					System.out.println("opened");
				}
				void closeroof() {
					System.out.println("closed");
				}
			
	}
}

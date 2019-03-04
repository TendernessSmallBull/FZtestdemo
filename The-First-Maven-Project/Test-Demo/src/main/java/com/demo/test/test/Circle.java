package com.demo.test.test;

class Circle {
	public double radius = 0;
	 
    public Circle() {
        getDrawInstance().drawSahpe();
        //必须先创建成员内部类的对象，再进行访问
    }
     
    private Draw getDrawInstance() {
    	Circle c = new Circle();
		Draw draw = c.new Draw();
		
		
        return new Draw();
    }
     
    class Draw {     //内部类
    	public double radius = 1.0;
        public void drawSahpe() {
        	System.out.println("wqqqq"+Circle.this.radius);
            System.out.println("aaaa"+radius);  //外部类的private成员
        }
    }
}

package com.demo.test.test;

class Circle {
	public double radius = 0;
	 
    public Circle() {
        getDrawInstance().drawSahpe();
        //�����ȴ�����Ա�ڲ���Ķ����ٽ��з���
    }
     
    private Draw getDrawInstance() {
    	Circle c = new Circle();
		Draw draw = c.new Draw();
		
		
        return new Draw();
    }
     
    class Draw {     //�ڲ���
    	public double radius = 1.0;
        public void drawSahpe() {
        	System.out.println("wqqqq"+Circle.this.radius);
            System.out.println("aaaa"+radius);  //�ⲿ���private��Ա
        }
    }
}

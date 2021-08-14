<<<<<<< HEAD
package com.study.spring.case02;

public class Paper3 {
	private Integer id;
	private Color color;
	private Size size;
	
	public Paper3() {
		
	}
	
	public Paper3(Color color, Size size) {
		this.color = color;
		this.size = size;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Paper3 [id=" + id + ", color=" + color + ", size=" + size + "]";
	}
	
	
	
}
=======
package com.study.spring.case02;

public class Paper3 {
	private Integer id;
	private Color color;
	private Size size;

	public Paper3(Color color, Size size) {
		this.color = color;
		this.size = size;
	}
	public Paper3() {
		
	}
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public Size getSize() {
		return size;
	}



	public void setSize(Size size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "Paper3 [id=" + id + ", color=" + color + ", size=" + size + "]";
	}
}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git

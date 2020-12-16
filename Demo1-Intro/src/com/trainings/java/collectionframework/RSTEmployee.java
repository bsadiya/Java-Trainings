package com.trainings.java.collectionframework;

public class RSTEmployee implements Cloneable{

	int id;
	String name;
	
	public RSTEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public RSTEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RSTEmployee [id=" + id + ", name=" + name + "]";
	}

	
	@Override
	public int hashCode() {
		/*
		 * final int prime = 31; int result = 1; result = prime * result + id; result =
		 * prime * result + ((name == null) ? 0 : name.hashCode()); return result;
		 */
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; RSTEmployee other = (RSTEmployee) obj; if
		 * (id != other.id) return false; if (name == null) { if (other.name != null)
		 * return false; } else if (!name.equals(other.name)) return false; return true;
		 */
		RSTEmployee other = (RSTEmployee) obj;
		 if(id != 10001) 
			 return false;
		 return true;
	} 
	
	@Override
	protected Object clone(){
		return new RSTEmployee();
	}
	
}


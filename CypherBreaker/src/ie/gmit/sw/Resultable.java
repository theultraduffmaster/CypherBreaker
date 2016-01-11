package ie.gmit.sw;
//Abstract Interface
public interface Resultable {

	public abstract String getPlainText();

	public abstract void setPlainText(String plainText);

	public abstract int getKey();

	public abstract void setKey(int key);

	public abstract double getScore();

	public abstract void setScore(double score);

}
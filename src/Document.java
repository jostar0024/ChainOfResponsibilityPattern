
public class Document {
	private final int m_number;//書類の種類
	
	public Document(final int number) {
		this.m_number = number;
	}
	
	public int getNumber() {
		return m_number;
	}
	
	@Override
	public String toString() {
		return String.format("[Document %d ]", m_number);
	}
}


public abstract class Support {
	private final String m_name;//窓口担当者の名前
	private Support m_next;
	
	public Support(final String name) {
		m_name = name;
		m_next = null;
	}
	
	public Support setNext(final Support next) {
		m_next = next;
		return next;
	}
	//たらい回し先を設定する
	public void support(final Document document) {
		if(resolve(document)) {
			done(document);
		}
		else if(m_next != null) {
			m_next.support(document);
		}
		else {
			fail(document);
		}
		
	}
	
	//ドキュメント解決者の文字列表現
	@Override
	public String toString() {
		return "[" + m_name + "]";
	}
	
	//解決しようとする
	protected abstract boolean resolve(final Document document);
	
	//解決した
	protected void done(final Document document) {
		System.out.println(document + "is resolved by " + this + ".");
	}
	
	//解決しなかった
	protected void fail(final Document document) {
		System.out.println(document + "cannot be resolved");
	}
}

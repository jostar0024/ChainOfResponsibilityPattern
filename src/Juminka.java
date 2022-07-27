
public class Juminka extends Support{

	public Juminka(final String name) {
		super(name);
	}

	//書類番号が10未満の書類を処理する
	@Override
	protected boolean resolve(final Document document) {
		return document.getNumber() < 10;
	}

}

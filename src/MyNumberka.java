
public class MyNumberka extends Support{

	public MyNumberka(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Document document) {
		//書類番号が10以上20未満の書類を処理する
		return document.getNumber() >= 10 && document.getNumber() < 20;
	}

}

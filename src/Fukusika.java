
public class Fukusika extends Support{

	public Fukusika(String name) {
		super(name);
		}

	@Override
	protected boolean resolve(Document document) {
		//書類番号が20以上30未満の書類を処理する
		return document.getNumber() >= 20 && document.getNumber() < 30;
	}

}

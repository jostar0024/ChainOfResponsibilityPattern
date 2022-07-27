
public class Main {

	public static void main(String[] args) {
		final Support tanaka = new Juminka("Tanaka");
		final Support yoshida = new Fukusika("Yoshida");
		final Support sato = new MyNumberka("Sato");
		
		//連鎖の形成
		tanaka.setNext(yoshida).setNext(yoshida).setNext(sato);
		
		//書類の処理
		for (int i = 0 ; i < 100; i += 10) {
			tanaka.support(new Document(i));
		}
	}
}
